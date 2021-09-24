package chat.gui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class ChatClientApp {
	private static final String SERVER_IP = "127.0.0.1";
	private static final int SERVER_PORT = 6000;
	private static ChatWindow chatWindow;

	public static void main(String[] args) {
		String name = null;
		Scanner scanner = new Scanner(System.in);
		Socket socket = null;
		BufferedReader bufferedReader;
		PrintWriter printWriter;

		while (true) {

			System.out.println("대화명을 입력하세요.");
			System.out.print(">>> ");
			name = scanner.nextLine();

			if (name.isEmpty() == false) {
				break;
			}

			System.out.println("대화명은 한글자 이상 입력해야 합니다.\n");
		}

		try {
			// 1 create socket
			socket = new Socket();
			// 2 connect to server
			socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));
			log("connected");

			// 3 get iostream
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);

			// 4 join
			System.out.print("닉네임>>");
			String nickname = scanner.nextLine();
			printWriter.println("join:" + nickname);
			String line = bufferedReader.readLine();

			if ("join:ok".equals(line)) {
				chatWindow = new ChatWindow(name, bufferedReader, printWriter);
				chatWindow.show();
			}

		} catch (SocketException e) {
			log("갑자기 서버로 부터 연결 끊김");
		} catch (IOException e) {
			log("error:" + e);
		}
	}

	public static void log(String log) {
		System.out.println("[ChatClient] " + log);
	}

}
