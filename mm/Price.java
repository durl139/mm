package mm;

public class Price {
	public static void main(String[] args) {

		int[]array={1, 3, 5, 7, 100, 0, 1};
		int max=array[0];
		int min=array[0];
		System.out.println("配列");
		for(int i = 0; i < array.length; i++) {
			if(max<array[i]){
				max=array[i];
			}
			if(min>array[i]){
				min=array[i];
			}
			for(int i1=0;i1 < array.length; i1++)
				{
					System.out.println(array[i1]+"");
		}
		System.out.println("最大値:"+max+"最小値:"+min);

	}
	}
}
