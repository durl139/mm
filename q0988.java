
public class q0988 {

	public static void main(String[] args) {
		int[]array={1, 3, 5, 7, 100, 0, 1};
		int max=array[0];
		int min=array[0];
		System.out.println("配列");
		for(int i = 0; i < array.length; i++) {
			if(max<array[i]){
				max=array[i];
			}
			if(min<array[i]){
				min=array[i];
			}
			for(int j=0;j < array.length;j++)
				{
					System.out.println(array[i]+"");
		}

		System.out.println("最大値:"+max+"最小値:"+min);

}
	}
}