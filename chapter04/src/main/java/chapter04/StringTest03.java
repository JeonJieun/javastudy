package chapter04;

public class StringTest03 {

	public static void main(String[] args) {
		// String s1 = "Hello " + "World" + "Java" + 1.8;
		// 의 내부는 아래 모습 (메모리 할당 계속함)
		String s1 = new StringBuffer("Hello ")
		.append("world ")
		.append("Java ")
		.append(1.8)
		.toString();
		
		System.out.println(s1);
		
		
		//버퍼 계속 만들어서 시간 오래 걸림
		String s2 = "";
		for(int i=0; i<1000000; i++) {
			//s2 = s2 + i;
			//s2 = new STringBuffer(s2).append(i).toString();
			
		}
		
		StringBuffer sb2 = new StringBuffer("");
		for(int i =0; i<1000000; i++) {
			sb2.append(i);
		}
		
		String s3 = sb2.toString();
		System.out.println(s3.length());
		
		// String method들
		String s4 = "aBcABCabcAbc";
		System.out.println(s4.length());
		System.out.println(s4.charAt(2));
		System.out.println(s4.indexOf("abc"));
		System.out.println(s4.indexOf("abc", 7)); //7부터 찾음
		System.out.println(s4.substring(3));
		System.out.println(s4.substring(3, 5));
		
		String s5 = "    ab   cd   ";
		String s6 = "efg,hij,klm,nop,qrs";
		
		String s7 = s5.concat(s6);
		System.out.println(s7);
		
		System.out.println("----" + s5.trim() + "----");
		System.out.println("----" + s5.replaceAll(" ", "") + "----");
		
		String[] tokens = s6.split(",");
		for(String s : tokens) {
			System.out.println(s);
		}
		
		
		String[] tokens2 = s6.split(" ");
		for(String s : tokens2) {
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		
	}

}
