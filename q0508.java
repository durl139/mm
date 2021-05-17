
/**
 * 質問８︓LV10のパスカルの三⾓形を出⼒してください。
 * @author he
 *	@date 2021/5/17
 */

public class q0508 {

	public static void main(String[] args) {

		int[][] array = new int[10][10];
		for (int i = 0; i < array.length; i++) {
			array[i]=new int[i+1];

			for (int j = 0; j <= i; j++) {
				// 処理追加
				if(j==0||j==i) {
					array[i][j]=1;
				}
				else {
					 //パスカルの三⾓形の計算式
					array[i][j]=array[i-1][j-1]+array[i-1][j];
				}
				System.out.print(array[i][j]+" ");// 配列の要素を出力する
			}
			System.out.println();
		}
	}
}