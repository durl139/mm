
public class q0508 {

	public static void main(String[] args) {
		a();
	}

	public static void a() {

	int[] n = new int[1];
	n[0] = 1;
	for (int i = 0; i < 11; i++) {
	print(n);
	n = n(n);
	}

	}

	public static int[] n(int[] n) {

	int[] is = new int[n.length + 1];
	is[0] = n[0];
	for (int i = 1; i < n.length; i++) {
	is[i] = n[i - 1] + n[i];
	}
	is[is.length - 1] = 1;
	return is;
	}

	static void print(int[] is) {
	for (int i : is) {
	System.out.print(i + " ");
	}
	System.out.println();
	}


//https://programamemo2.blogspot.com/2007/07/java_13.html
	}

