package chap09.sec01.exam04;

public class LocalClass {
	void method() {
		class D{
			D(){}
			int field1;
//			static int field2; 로컬클래스내부에 static X
			void method1() {}
//			static void method2() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}