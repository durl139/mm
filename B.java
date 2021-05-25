
public class B {

	public static void main(String[] args) {
		Computer i = new Computer("DELL", 123);

		System.out.println(i.getName());
		i.setName("Mac");
		System.out.println(i.id);
		i.play();
		System.out.println(i.getName());
	}

}
