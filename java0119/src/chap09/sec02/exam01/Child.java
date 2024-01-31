package chap09.sec02.exam01;

class Parent {
	void method() {
	}
}
public class Child extends Parent {
	@Override
	void method() {
		super.method();
	}
	public static void main(String[] args) {
//		Child child = (Child)parent();
		Parent parent = new Parent() {
			@Override
			void method() {
				super.method();
			}
		};
	}
}