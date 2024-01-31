package chap09.sec01.exam04;

public class Outter {
	static String str = "static-str";
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() { // 중첩 클래스에서 바깥 클래스 참조 얻기
			System.out.println(Outter.str); // 바깥 클래스의 static field
			System.out.println(this.field); // 중첩 클래스 객체 참조
			System.out.println(Outter.this.field); // 바깥 클래스 객체 참조
		}
	}
}