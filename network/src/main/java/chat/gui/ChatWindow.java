package chat.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ChatWindow {

	private Frame frame;
	private Panel pannel;
	private Button buttonSend;
	private TextField textField;
	private TextArea textArea;
	private ChatClientThread thread;
	private BufferedReader bufferedReader;
	private PrintWriter printWriter;
	private boolean flag = false;

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public boolean isFlag() {
		return flag;
	}

	public ChatWindow(String name, BufferedReader bufferedReader, PrintWriter printWriter) {
		frame = new Frame(name);
		pannel = new Panel();
		buttonSend = new Button("Send");
		textField = new TextField();
		textArea = new TextArea(30, 80);

		// 2. IOStream 가져오기
		this.bufferedReader = bufferedReader;
		this.printWriter = printWriter;

		// 3. Chat Client Thread 생성
		thread = new ChatClientThread();
		thread.start();

	}

	public void show() {
		// 1. UI 초기화

		// Button
		buttonSend.setBackground(Color.GRAY);
		buttonSend.setForeground(Color.WHITE);
		buttonSend.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				sendMessage();
			}
		});

		// Textfield
		textField.setColumns(80);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char keyCode = e.getKeyChar();
				if (keyCode == KeyEvent.VK_ENTER) {
					sendMessage();
				}
			}
		});

		// Pannel
		pannel.setBackground(Color.LIGHT_GRAY);
		pannel.add(textField);
		pannel.add(buttonSend);
		frame.add(BorderLayout.SOUTH, pannel);

		// TextArea
		textArea.setEditable(false);
		frame.add(BorderLayout.CENTER, textArea);

		// Frame
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				finish();
			}
		});
		frame.setVisible(true);
		frame.pack();

	}

	private void sendMessage() {
		String message = textField.getText();
		if (!message.equals("")) {
			printWriter.println("message:" + message);
			System.out.println("메세지 보내는 프로토콜 구현:" + message);
			textField.setText("");
			textField.requestFocus();
		}
	}

	private void updateTextArea(String message) {
		textArea.append(message);
		textArea.append("\n");
	}

	private void finish() {
		printWriter.println("quit");
		System.exit(0);
	}

	private class ChatClientThread extends Thread {
		private String data;

		@Override
		public void run() {

			while (!isFlag()) {
				try {
					data = bufferedReader.readLine();
				} catch (IOException e) {
					setFlag(true);
				}

				if (!isFlag()) {
					updateTextArea(data);
				}
			}

			return;
		}
	}
}