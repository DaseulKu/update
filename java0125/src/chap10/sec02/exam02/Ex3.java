package chap10.sec02.exam02;

class AnyClass3 {
	void anyMethod() {
		throw new NullPointerException();
	}
}
public class Ex3 {
	public static void main(String[] args) {
		AnyClass3 ac = new AnyClass3();
		ac.anyMethod();
	}
}