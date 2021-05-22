public class q0606 {

	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 3, 4};
		int startIndex =1;
		int length =2;
		printArray(subArray(array, startIndex, length));

	}

	  public static int[] subArray(int[] array, int startIndex, int length) {

	        int[] result = new int[2];
	        for (int i = 0; i < length; i++) {
	        	result[i] = array[startIndex+i] ;
	        }

	        return result;
	    }


	public static void printArray(int[] left) {

		if (left == null) {
			System.out.println("null");
			return;
		}
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (Object obj : left) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
}
