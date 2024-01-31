package chap07.sec01.exam01;

public class ChildEx {

	public static void main(String[] args) {
		Child child = new Child(); // 자식클래스 객체생성
		
		Parent parent = child; // 부모타입 부모타입변수에 자식타입변수 대입 자동타입변환
		parent.method1(); // 부모클래스에 있는거 상속받은 자식이 호출가능
		parent.method2(); // 재정의된 메소드 호출 가능
		//parent.method3(); // 자식클래스에서 생성한 메소드 호출불가능
	}
}
