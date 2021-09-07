package prob5;

public class Prob5 {

	public static void main(String[] args) {

		int ten = 10; //단위
		int tens_digit = 0; // 10의 자리
		int units_digit = 0; // 1의 자리
		boolean tens_digit_b = false; //10의 자리가 (3, 6, 9) 면 true
		boolean units_digit_b = false; //1의 자리가 (3, 6, 9) 면 true

		for (int num = 1; num < 100; num++) {
			tens_digit = num / ten;
			units_digit = num % ten;
			
			tens_digit_b = (tens_digit > 0 && tens_digit % 3 == 0);
			units_digit_b = (units_digit > 0 && units_digit % 3 == 0);

			if (tens_digit_b || units_digit_b) {
				System.out.print(num + " ");
				
				if (tens_digit_b) {
					System.out.print("짝");
				}
				if (units_digit_b) {
					System.out.print("짝");
				}
				
				System.out.println();
				
			}

		}

	}
}