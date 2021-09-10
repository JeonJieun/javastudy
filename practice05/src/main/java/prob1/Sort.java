package prob1;

public class Sort {

	public static void main(String[] arg) {

		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int count = array.length;

		System.out.println("Before sort.");

		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();
		System.out.println();

		// 정렬 알고리즘
		int temp = 0;

		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count - i - 1; j++) {
				System.out.print("[");

				if (array[j] < array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
				for (int x = 0; x < count; x++) {
					System.out.print(array[x] + " ");
				}
				System.out.print("]");

				
			}

			System.out.println();
			System.out.println();
		}

		// 결과 출력
		System.out.println("\nAfter Sort.");

		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
	}
}