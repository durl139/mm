public class q0608 {

	public static void main(String[] args) {
		int[] array = {6, 700, 4, 80, 90};

		printArray(bubbleSort(array));

	}

	  public static int[] bubbleSort(int[] array) {

		   for(int i = 0; i < array.length; i++){
	            for(int j = i+1; j < array.length; j++){
	                if(array[j] > array[i]){
	                    int num = array[i];
	                    array[i] = array[j];
	                    array[j] = num;
	                }
	            }
		   }
			return array ;

	    }



	public static void printArray(int[] is) {

		if (is == null) {
			System.out.println("null");
			return;
		}
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (Object obj : is) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
}
