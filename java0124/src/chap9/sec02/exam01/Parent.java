package chap9.sec02.exam01;

public class Parent {
	void parentMethod() {
	};
}

class Child extends Parent {

	@Override
	void parentMethod() {

		super.parentMethod();
	}

}

class A {
	void method1(Parent p) {
	}

	void method2() {
		method1( // method1()메소드 호출
				new Parent() { // method1() 의 매개값으로 익명 자식 객체 대입
					int x; // 익명 자식 객체 내부에서만 사용

					@Override
					void parentMethod() {

						super.parentMethod();
					}

				});
	}

	Parent field = new Parent() { // A 클래스 필드 선언

		@Override
		void parentMethod() { // Parent 의 메소드 재정의

			super.parentMethod();
		}

	};

	void method() { // A 클래스 내에서 로컬 변수 선언
		Parent var = new Parent() {

			@Override
			void parentMethod() {

				super.parentMethod();
			}

		};
	}
}