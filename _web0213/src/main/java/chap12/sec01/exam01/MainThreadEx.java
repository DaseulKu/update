package chap12.sec01.exam01;

public class MainThreadEx {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		User1 user1 = new User1(); // 스레드 생성
		user1.setCalculator(cal); // 공유 객체 설정
		user1.start(); // 스레드 시작
		
		User2 user2 = new User2();
		user2.setCalculator(cal);
		user2.start();

	}

}
