package chap09.sec01.exam02;

public class A {
//	static int field3; A 객체 생성 없이도 사용 O
	class B{
		// 인스턴스 멤버 클래스
		B(){} // 생성자
		int field1; // 인스턴스 필드
//		static int field2; B 객체 생성 없이 정적필드X
		void method1() {}
//		static void method2() {} B 객체 생성 없이 정적메소드X
	}
	// A 클래스 내부
	void methodA() {
		B b = new B();
		b.field1 = 3;
		b.method1();
	}
}
