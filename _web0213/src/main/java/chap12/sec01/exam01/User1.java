package chap12.sec01.exam01;

public class User1 extends Thread {
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("User1"); // thread 이름을 User1 으로 설정
		this.calculator = calculator; // 공유 객체인 Calculator 를 필드에 저장
	}

	@Override
	public void run() {
		calculator.setMemory(100);// 공유 객체인 Calculator 의 메모리에 100 을 저장
	}

}
