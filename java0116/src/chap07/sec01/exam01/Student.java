package chap07.sec01.exam01;

public class Student extends People {
	String hakbun;

	public Student(String name, String hakbun) { //자식클래스의 생성자가 매개값을 받아서 ?
//		System.out.println(); 부모 생성자 전에 다른거 X 무조건 부모 생성자호출이 첫줄
//		super(name); 부모의 기본생성자호출
//		부모클래스에 생성자가 명시적으로 선언되었다면 자식이 생성자에서 부모생성자를 호출하고 매개값을 입력해서 실행시켜야함		
		this.hakbun = hakbun;
	}
	void method3() { //자식클래스에 메소드 선언 후?
		super.method1(); // > 부모클래스 메소드 호출 (super 생략가능)
	}

	@Override
	void method1() {//메소드 재정의
		System.out.println();
		super.method1(); // 부모의 메소드 실행 (생략가능)
	}
	
	
}
