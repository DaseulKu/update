package chap12.sec01.exam01;

public class BeepPrintEx2 {

	public static void main(String[] args) {
		
		Thread th = new Thread(new BeepTask());
		th.start(); // 새로운 thread 생성되고 해당 thread 에서 run() 메소드가 별도의 실행스택에서 실행됨
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main 종료");
	}
}