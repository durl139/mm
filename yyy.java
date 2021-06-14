
public class yyy {
	public class Parent {
		public void hello() {
		System.out.println("parent method");
		}
		}
		// Child.java
		public class Child extends Parent {
		@Override // 親クラスの強制的にOverrideする意味（アノテーション）
		public void hello() {
		System.out.println("child method");
		}
		}
		// Kicker.java

}
