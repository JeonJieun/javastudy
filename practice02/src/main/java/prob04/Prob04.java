package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {

		int size = str.length();
		
		char[] ch = new char[size];
		
		for(int i=0; i<size; i++) {
			ch[size-i-1] = str.charAt(i);
		}
		
		return ch;
	}

	public static void printCharArray(char[] array){
		System.out.println( array );
	}
}