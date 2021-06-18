package jp.dcnet.aa;

public class kicker09t {
	public static void main(String...args) {
		// ラムダ式
		IPet cat = () -> {
		System.out.println("ニャー");
		};
		cat.hello();
		}
}
