package c04;

public class q06 {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 3, 5, 7, 100, 0, 1 };

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];

		}
		System.out.println("合計は " + sum);
	}
}