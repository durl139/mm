public class TestMax {

	public static void main(String[] args) {

		int[] array = { 1, 3, 5, 7, 9 };

		int intMax = Max(array);
		int intMin = Min(array);
		   int sum = 0;
		 //和、平均値を求める
			 for (int i2 = 0; i2 < array.length; i2++) {
			        sum += array[i2];

			    }
		 System.out.println("总和数是："+sum);
		System.out.println("最大値は" + intMax);
		System.out.println("最小値は" + intMin);
	}

	public static int Max(int[] array) {

		int intMax = array[0];

		for (int i = 1; i < array.length; i++) {
			if (intMax < array[i]) {
				intMax = array[i];
			}
		}
		return intMax;
	}

	public static int Min(int[] array) {

		int intMin = array[0];

		for (int i = 1; i < array.length; i++) {
			if (intMin > array[i]) {
				intMin = array[i];
			}
		}
		return intMin;
	}
}



