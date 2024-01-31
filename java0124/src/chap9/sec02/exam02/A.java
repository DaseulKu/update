package chap9.sec02.exam02;

class Parent {
	void parentMethod() {
	}
}

public class A {
	Parent field = new Parent() {
		int childField; // 익명 자식 객체의 필드

		void childMethod() {} // 익명 자식 객체의 메소드
		
	}; // A Class field : Parent 익명 자식 객체 생성

	void method() {
		field.parentMethod();
	} // A Class method
}