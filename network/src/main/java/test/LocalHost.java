package test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalHost {

	public static void main(String[] args) {
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			String hostName = inetAddress.getHostName();
			String hostAddress = inetAddress.getHostAddress();

			System.out.println(hostName);
			System.out.println(hostAddress);
			System.out.println();

			byte[] addresses = inetAddress.getAddress();
			for (byte address : addresses) {
				// System.out.println((int)address);
				System.out.print(address & 0x000000ff); // 128비트/16비트 = 8 8자리
				System.out.print('.');
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
