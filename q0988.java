
public class q0988 {

	  public static void main(String[] args) {
	        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
	        printArr(arr);
	        arr = deleteFirst(arr);
	        printArr(arr);
	    }

	    static void printArr(int[] arr) {
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }

	    static int[] deleteFirst(int[] arr) {
	        int[] temp = new int[arr.length - 1];
	        System.arraycopy(arr, 1, temp, 0, temp.length);
	        return temp;
	    }