package chap07.sec01.exam01;

class Parent2 {} // 부모 두개 못가짐
class Parent { // 부모클래스
	int money;
	
	void disp() {
		System.out.println(money);
	}
}
public class Child extends Parent { // 자식클래스
	public Child(){ //생성자
		this.money += 300;		
	}
	public static void main(String[] args) {
		Child ch = new Child();
		ch.disp(); // 부모 메소드 실행
//		System.out.println(ch.money);
	}
}