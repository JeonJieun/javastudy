package chapter03;

public class ArrayUtil {
	
	
	public static double[] intToDouble(int[] arr) {
		double[] d = new double[arr.length];
		for(int i=0; i<arr.length; i++) {
			d[i] = arr[i];
		}
		
		return d;
	}

}
