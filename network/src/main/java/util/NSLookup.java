package util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NSLookup {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String lines;
		String line;
		String[] tokens;

		while (true) {
			lines = scanner.nextLine();

			if ("quit".equals(lines)) {
				break;
			}

			tokens = lines.split(" ");

			if (tokens.length != 2 || tokens[0] == "nslookup") {
				System.out.println(">> 잘못된 입력입니다.");
				continue;
			}

			line = tokens[1];

			try {

				InetAddress[] inetAddresses = InetAddress.getAllByName(line);
				String hostName = inetAddresses[0].getHostName();

				System.out.println("서버: " + hostName);
				System.out.print("address: ");

				byte[] addresses;
				int i;

				for (int n = 0; n < inetAddresses.length; n++) {
					addresses = inetAddresses[n].getAddress();
					i = 0;
					for (byte address : addresses) {
						System.out.print(address & 0x000000ff); // 128비트/16비트 = 8 8자리
						if (i != 3)
							System.out.print('.');
						i++;
					}
					System.out.println();
				}
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
		}
		scanner.close();
	}

}
