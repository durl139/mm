package jp.dcnet.aa;

public class abtest01 {

	public static void main(String[] args) {
		Animal a = new Dog();
		a.move();
		Animal x = new Cat();
		x.move();
	}

}

//动物类
abstract class Animal {
	//抽象方法
	public abstract void move();
}

class Dog extends Animal {

	@Override
	public void move() {
		System.out.println("汪 ");
	}

}
class Cat extends Animal{
	@Override
	public void move() {
		System.out.println("喵");
	}
}
