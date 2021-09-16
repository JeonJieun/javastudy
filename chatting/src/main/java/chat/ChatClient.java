package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class ChatClient {
	private static final String SERVER_IP = "127.0.0.1";
	private static final int SERVER_PORT = 6000;

	public static void main(String[] args) {
		Socket socket = null;
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);

			socket = new Socket();

			socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));
			log("connected");

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);

			System.out.print("닉네임>>");
			String nickname = scanner.nextLine();
			printWriter.println("join:" + nickname);

			ChatClientReceiveThread thread = new ChatClientReceiveThread(bufferedReader);
			thread.start();

			while (true) {
				String input = scanner.nextLine();

				if ("quit".equals(input)) {
				    thread.setFlag(true);
					break;
				}

				else {
					printWriter.println("message:" + input);
				}

			}

		} catch (SocketException e) {
			log("갑자기 서버로 부터 연결 끊김");
		} catch (IOException e) {
			log("error:" + e);
		} finally {
			try {
				if (scanner != null) {
					scanner.close();
				}
				if (socket != null && socket.isClosed() == false) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void log(String log) {
		System.out.println("[ChatClient] " + log);
	}
}
