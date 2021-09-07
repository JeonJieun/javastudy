package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		int amount = 0; //금액
		int remainder = 0; //나머지
		
		System.out.print("금액: ");
		
		amount = scanner.nextInt();		
		remainder = amount;
		
		for(int i=0; i<MONEYS.length; i++) {
			System.out.println(MONEYS[i]+"원 : "+remainder/MONEYS[i]+"개");
			remainder %= MONEYS[i];
		}
		
		scanner.close();
 	}
}