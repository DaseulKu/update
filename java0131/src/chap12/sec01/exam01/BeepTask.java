package chap12.sec01.exam01;

public class BeepTask implements Runnable{
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("beep");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("BeepTask 종료");
	}
}