public class q7003 {
	public static void main(String args[]) {

		int[][] data = new int[][] {
				{ 1, 2, 3, 4 },
				{ 21, 22, 23, 24 }
		};
		int[][] data1 = new int[][] {
			{ 2, 4, 6, 8 },
			{ 28, 32, 34, 38 }
	};
		q703 q = new  q703(data);
		q703 c = new  q703(data1);
		int sum = q.add();
		int sum1 = c.add();
		System.out.println(sum);
		System.out.println(sum1);


	}
}