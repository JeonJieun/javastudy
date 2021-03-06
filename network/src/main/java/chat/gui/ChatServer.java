package chat.gui;

import java.io.IOException;
import java.io.Writer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {

private static final int PORT = 6000;
private static ChatServerThread thread;
	
	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		
		List<Writer> listWriters = new ArrayList<Writer>();

		
		try {
			serverSocket = new ServerSocket();
			
			String hostAddress = InetAddress.getLocalHost().getHostAddress();
			serverSocket.bind(new InetSocketAddress("0.0.0.0", PORT));
			
			
			log("연결 기다림 "+ hostAddress + ":" + PORT);
			
			while(true) {
				
				Socket socket = serverSocket.accept();
				thread = new ChatServerThread(socket, listWriters);
				thread.start();
			}

		} catch(IOException e) {
			log("error: " + e);
		}
	}
	
	public static void log(String log) {
		System.out.println("[ChatServer] " + log);
	}

}