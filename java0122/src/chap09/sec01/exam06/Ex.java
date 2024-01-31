package chap09.sec01.exam06;

public class Ex {

	public static void main(String[] args) {
		A.method2(); // 정적메소드 호출
		A.B b = A.field3; // 정적 필드 사용
		A.C c = A.field4;
		
		A a = new A(); // A 객체생성
		a.method1(); //  A 객체를 통해 인스턴스 메소드 호출
		A.B b1 = a.field1; //  A 객체를 통해 인스턴스 필드 사용
		A.C c1 = a.field2;
	}
}