package chap09.sec01.exam06;

public class A {
	// 인스턴스 필드
	B field1 = new B();
	C field2 = new C();
	// 정적 필드 초기화
//	static B field3 = new B(); A 객체가 생성되어야 B 객체도 생성됨
	static B field3 = new A().new B();
	static C field4 = new C();
	
	// 인스턴스 메소드
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	// 정적 메소드
	static void method2() {
//		B var1 = new B();
		B var = new A().new B();
		C var2 = new C();
	}
	class B{} // 인스턴스 멤버 클래스
	static class C{} // 정적 멤버 클래스
}