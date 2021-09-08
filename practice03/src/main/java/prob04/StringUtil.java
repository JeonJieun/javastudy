package prob04;

public class StringUtil {

	public static String concatenate(String[] strArr) {
		
		String str = "";
		
		for(int i = 0; i<strArr.length; i++) {
			str = str + strArr[i];
		}
		
		return str;
		
	}
}
