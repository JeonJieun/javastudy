package chat;

import java.io.BufferedReader;
import java.io.IOException;

public class ChatClientReceiveThread extends Thread {
	private BufferedReader bufferedReader;
	private String data;
	private boolean flag = false;

	ChatClientReceiveThread(BufferedReader bufferedReader) {
		this.bufferedReader = bufferedReader;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void run() {

		while (!flag) {
			try {
				data = bufferedReader.readLine();
			} catch (IOException e) {

			}

			System.out.println(data);
		}
	}
}
