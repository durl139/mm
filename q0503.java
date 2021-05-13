
public class q0503 {

	public static void main(String[] args) {
			int[]array={1, 2, 6, 7, 9, 6, 2, 1};
			int sum=0;
			int avg=0;
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
				for(int i2=0;i<array.length; i2++) {
					sum+=array[i2];
				}
				avg=sum/array.length;
			System.out.println("最大値:"+max+"最小値:"+min+"平均値:"+avg);

		}
		}
	}


