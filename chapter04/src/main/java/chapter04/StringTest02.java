package chapter04;

public class StringTest02 {

	public static void main(String[] args) {
		//immutability(불변성)
		
		//concat() -> temp -> s5가 마지막으로 가리킴
		
		String s1 = "abc";
		String s2 = "def";
		String s3 = s2;
		
		s2 = s1.toUpperCase();
		String s4 = s2.concat("??");
		String s5 = "!".concat(s2).concat("@");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		equalsHello(null);
		
	}
	
	//안전한 코딩 방법
	private static boolean equalsHello(String s) {
		return "Hello".equals(s);
	}

}
