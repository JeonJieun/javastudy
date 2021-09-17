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

	public boolean isFlag() {
		return flag;
	}

	@Override
	public void run() {

		while (!isFlag()) {
			try {
				data = bufferedReader.readLine();
			} catch (IOException e) {
				setFlag(true);
			}

			if (!isFlag()) {
				System.out.println(data);
			}
		}

		return;
	}
}
