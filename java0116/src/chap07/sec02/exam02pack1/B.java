package chap07.sec02.exam02pack1;

public class B {
	public B() {
		A a = new A();
		a.field = "value";
		a.method();
	}
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}