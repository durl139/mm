public class q703 {

	public int[][] data;

	public q703(int[][] data) {

		this.data = data;
	}

	public int add() {

		int sum = 0;
		for (int i = 0; i < data.length; i++) {

			for (int j = 0; j < data[i].length; j++) {

				sum = sum + data[i][j];
			}

		}
		return sum;

	}

}
