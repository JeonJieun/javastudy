package prob3;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		for (int n = 0; n < 10; n++) {

			int input = 0; // 입력값
			int sum = 0; // 합

			System.out.print("숫자를 입력하세요 : ");
			input = scanner.nextInt();

			if (input % 2 == 1) { // 홀수
				for (int i = 1; i <= input; i += 2)
					sum += i;
			}

			else { // 짝수
				for (int i = 2; i <= input; i += 2)
					sum += i;
			}

			System.out.println("결과 값 : " + sum);

			scanner.nextLine(); // 버퍼비우기
		}

		scanner.close();

	}

}