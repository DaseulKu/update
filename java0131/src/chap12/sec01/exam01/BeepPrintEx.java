package chap12.sec01.exam01;

public class BeepPrintEx {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("beep");
			try {
				Thread.sleep(500); // 0.5초간 일시정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); // Thread 쓴거 X 지원하는 sleep 메소드 쓴거
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}