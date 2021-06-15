package jp.dcnet.aa;

public class test2 {
	public class Animal {
		private String name;

		private int id;

		public Animal(String name, int id) {
		this.name = name;

		this.setId(id);

		}

		public void eat(){
		System.out.println(name+"");

		}

		public void sleep(){
		System.out.println(name+"");

		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

}
}
