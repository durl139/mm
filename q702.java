public class q702 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 6, 7, 9, 6, 2, 1 };
		int ave;
		int sum = 34;
		System.out.println("最大的数是：" + getMax(array));
		System.out.println("最小的值是：" + getMin(array));
		System.out.println("平均数是：" + getAve(array));

	}

	/**
	 *
	 * @param input
	 * @return
	 */
	public static int getMax(int[] input) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > max)

				max = input[i];
		}
		return max;
	}

	/**
	 *
	 * @param input
	 * @return
	 */
	public static int getMin(int[] input) {
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < input.length - 1; i++) {
			if (input[i] < result) {
				result = input[i];
			}
		}
		return result;
	}

	/**
	 *
	 * @param input
	 * @return
	 */
	public static double getAve(int[] input) {
		double result = 0;
		double sum = 0;
		for (int i = 0; i < input.length; i++) {

			sum += input[i];

			result = sum / input.length;

		}
		return result;
	}
}
