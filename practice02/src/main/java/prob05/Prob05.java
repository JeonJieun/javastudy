package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		int min=1;
		int max=100;
		int num=0;
		int challenge=1;
		int correctNumber=0;
		
		Random random = new Random();
		correctNumber = random.nextInt( 100 ) + 1; // 정답 램덤하게 만들기
		System.out.println(correctNumber);

		System.out.println("수를 결정하였습니다. 맞추어 보세요");
		
		while( true ) {

			System.out.println(min+"-"+max);
			System.out.print(challenge+">>");
			num = scanner.nextInt();
			challenge++;
			
			if(num>correctNumber) {
				System.out.println("더 낮게");
				max=num;
			}
			
			else if(num==correctNumber) { //정답
				System.out.println("맞았습니다.");
				System.out.print( "다시 하겠습니까(y/n)>>" ); //새 게임 여부 확인하기
				String answer = scanner.next();
				
				if( "y".equals( answer ) == false ) { //끝
					break;
				}				
				else { //초기화
					min=1;
					max=100;
					num=0;
					challenge=1;
					correctNumber = random.nextInt( 100 ) + 1;
					System.out.println(correctNumber);
				}
			}
			
			else {
				System.out.println("더 높게");
				min=num;
			}

		}
		
		scanner.close();
	}

}