package chap08.sec01.exam01;

public class RemoteControlEx {

	public static void main(String[] args) {
//		new RemoteControl(); 객체 생성 불가	
		RemoteControl rc; //인터페이스 변수 선언 후
		rc = new Audio(); // 구현객체 대입해야함
		rc = new Television();
//		RemoteControl rc1 = new Television(); 생성,대입 동시가능
//		rc.turnOn(); 인터페이스 추상메소드 사용가능
//		System.out.println(rc.MAX_VOLUME); 인터페이스 상수사용가능
//		rc.MAX_VOLUME = 100; 상수라 값바꾸기X (값을 제한)
	}
}