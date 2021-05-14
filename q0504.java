
public class q0504 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 6, 7, 9, 6, 2, 1 };
		int num=0;
        for(int j=0;j<array.length;j++) {
            for(int k =j+1;k<array.length;k++) {
                if(array[j]==array[k]) {
                    num++;
                }
            }
            if(num==1)
               System.out.println( "重复元素 : " + array[j] );
            num = 0;
        }
    }

}