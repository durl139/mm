
public class q0502 {

	public static void main(String[] args) {
		//n!=n*(n-1);
		int num = 1;
		for (int i = 1; i <= 5; i++)
		{
			num += num* i;
		}
		System.out.println("5の階乗" + num);
	}
}
