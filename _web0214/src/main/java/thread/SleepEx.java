package thread;

public class SleepEx {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// interrupt() 메소드가 호출되면 실행
			}
		}
	}
}