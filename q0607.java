
public class q0607 {

	public static void main(String[] args) {
		char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};
		int startIndex =2;
		int length =5;
		printArray(trim(input, startIndex, length));

	}

	  public static char[] trim(char[] input, int startIndex, int length) {

		  char[] output = new  char[5];
	        for (int i = 0; i < length; i++) {
	        	output[i] = input[startIndex+i] ;
	        }

	        return output;
	    }


	public static void printArray(char[] cs) {

		if (cs == null) {
			System.out.println("null");
			return;
		}
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (Object obj : cs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
}