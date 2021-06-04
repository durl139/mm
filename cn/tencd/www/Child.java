package cn.tencd.www;

public class Child extends Parent {

	public String name;
	public int age;
	protected int b; // 注意

	public Child() {
		super(); // 親クラスのコンストラクタを呼び出す
	}

	@Override
	public void hello() {
		super.b = 100;
		this.b = 200;
		System.out.println("invoked from child");
		System.out.println(b);
	}

	@Override
	public String toString() {
		return "Child [name=" + name + ", age=" + age + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}




}
