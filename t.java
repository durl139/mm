
public class t {

	public static void main(String[] args) {
		int[][] array = new int[][] {
				{ 1, 2, 3, 4 },
				{ 21, 22, 23, 24 }
		};

		int[][] array2d = new int[][] {
				{ 2, 4, 6, 8 },
				{ 28, 32, 34, 38 }
		};
		int[][] sum = new int[4][4];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				sum[i][j] += array[i][j] + array2d[i][j];
				System.out.println(sum[i][j]);
			}

		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
//				System.out.println(sum[i][j]);
			}
		}
	}

}
