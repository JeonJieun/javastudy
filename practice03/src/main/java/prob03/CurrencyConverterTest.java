package prob03;
/* 방법2
class CurrencyConverter {
	private static double rate;

	public static double toDollar(double won) {
		return won / rate;
		// 한국 원화를 달러로 변환
	}

	public static double toKRW(double dollar) {
		return dollar * rate;
		// 달러를 한국 원화로 변환
	}

	public static void setRate(double r) {
		rate = r;
		// 환율 설정(KRW/$1)
	}
}
*/

public class CurrencyConverterTest {
	
	public static class CurrencyConverter { //방법1
		   private static double rate;
		 
		   public static double  toDollar(double won) { // 한국 원화를 달러로 변환
			   return won / rate;
		   }
		   public static double  toKRW(double dollar) { // 달러를 한국 원화로 변환
			   return dollar * rate;
		   }  
		   public static void setRate(double r) { // 환율 설정(KRW/$1)
			   rate = r;
		   }
	}
	
	public static void main(String[] args) {
		
		CurrencyConverter.setRate(1197.0); //  환율을 세팅 합니다.
		
		double dollar = CurrencyConverter.toDollar( 1000000. );
		System.out.println( "백만원은 " + dollar + "달러 입니다" );
		
		double krw = CurrencyConverter.toKRW( 100. );
		System.out.println( "백달러는 " + krw + "원 입니다" );
	}

}
