public class q0609 {

	public static void main(String[] args) {
			int[] left = new int[] { 1, 2, 3, 4 };
			int[] right = new int[] { 5, 6, 7, 8 };

			printArray(megerArray(left, right, right));

		}

		public static int[] megerArray(int[] left, int[] right,int[] result) {
			int[] result1 = new int[left.length + right.length];
			for (int i = 0; i < left.length; i++) {
				result1[i] = left[i];
			}

			for (int i = 0; i < right.length; i++) {
				result1[left.length + i] = right[i];
			}
			for(int i = 0; i < result1.length; i++){
	            for(int j = i+1; j < result1.length; j++){
	                if(result1[j] < result1[i]){
	                    int num = result1[i];
	                    result1[i] = result1[j];
	                    result1[j] = num;
	                }
	            }
		   }

			return result1;

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


