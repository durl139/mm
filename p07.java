
public class p07 {

	public static void main(String[] args) {
		int[][] array = new int[][] {
				{ 1, 2 },
				{ 21, 22}
		};

		int[][] array2d = new int[][] {
				{ 2, 4 },
				{ 28, 32 }
		};
		int[][] sum = new int[2][2];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				sum[i][j] += array[i][j] + array2d[i][j];

			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println(sum[i][j]);
			}
		}
	}

}
