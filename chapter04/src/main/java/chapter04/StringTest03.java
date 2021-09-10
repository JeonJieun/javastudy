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
		
	}

}
