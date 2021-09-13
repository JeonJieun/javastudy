package prob01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Gugudan {

	static int resultNumber = 0;

	public static void main(String[] args) {
		int l = randomize(1, 9); //1~9
		int r = randomize(1, 9);

		resultNumber = l * r;

		int[] answerNumbers = randomizeAnswers();
		int loc = randomize(0, 8);
		answerNumbers[loc] = resultNumber;

		System.out.println(l + " x " + r + " = ?");

		int length = answerNumbers.length;
		for (int i = 0; i < length; i++) {
			if (i % 3 == 0) {
				System.out.print("\n");
			} else {
				System.out.print("\t");
			}

			System.out.print(answerNumbers[i]);
		}

		System.out.print("\n\n");
		System.out.print("answer:");

		Scanner s = new Scanner(System.in);
		int answer = s.nextInt();
		s.close();

		System.out.println((answer == resultNumber) ? "정답" : "오답");
	}

	private static int randomize(int lNum, int rNum) {
		int random = (int) (Math.random() * rNum) + lNum;
		return random;
	}

	private static int[] randomizeAnswers() {
		final int COUNT_ANSWER_NUMBER = 9;
		int[] boardNumbers = new int[COUNT_ANSWER_NUMBER];
		
		/*
		//set 사용x
		for(int i=0; i<COUNT_ANSWER_NUMBER; i++ ) {
			int x = randomize(1, 9);
			int y = randomize(1, 9);
			boardNumbers[i] = x*y;
			for(int j=0; j<i; j++) {
				if(boardNumbers[j]==boardNumbers[i]) {
					i--;
					break;
				}
			}
		}
		*/
		
		//set 사용
		Set<Integer> set = new HashSet<Integer>();
		
		while(!(set.size()==COUNT_ANSWER_NUMBER)) {
			int x = randomize(1, 9);
			int y = randomize(1, 9);
			set.add(x*y);
		}
		
		int count = 0;
		for(int n : set) {
			boardNumbers[count++] = n;
		}
		
		return boardNumbers;
	}
}
