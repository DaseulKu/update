package chap09.sec01.exam03;

public class A {
	static class C{
//		정적 멤버 클래스
		C(){} // 생성자
		int field1; // 인스턴스 필드
		static int field2; // 정적 필드
		void method1() {} // 인스턴스 메소드
		static void method2() {} // 정적 메소드
	}
//	A 클래스 외부
	void methodA() {
//		C.field2 = 10; 정적필드는 객체생성없이 O
		C c = new C();
		c.field1 = 3; // 인스턴스 필드 사용
		c.field2 = 10;	
	}
}