package chap09.sec01.exam02;

public class Ex {

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();		
//		A.B b = new A().new B(); 한 줄로 작성한 것		
		b.field1 = 3;
		b.method1();
	}
}