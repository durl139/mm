/**
 * 設問１︓1から100までの偶数の和を求める(for + if)。
 * @author he
 *	@date 2021/5/17
 */

public class q501 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}

		}
		System.out.println("1-100偶数合:" + sum);
	}
}
