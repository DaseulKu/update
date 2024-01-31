package chap07.sec02.verify03;

public class Ex {

	public static void method(B b) {
		
	}
	public static void main(String[] args) {
		method(new B());//객체 생성하면서 매개변수로 넘겨주기 가능
		
		B b1 = new B(); // 1번		
		B b3 = new D(); // 3번
		B b4 = new E(); // 4번
		
//		B b2 = (B)new A(); > 2번 오답 (강제형변환 불가
		
		A a = new A(); // 부모로 객체 생성해서
		if(a instanceof B) { // 자식클래스에 부모??????
			B b = (B)a;
			System.out.println("변환가능");
		}else {
			System.out.println("변환불가능");
		}
	}
}
