package chap12.sec01.verify;

public class MovieThread extends Thread {

	public MovieThread() {
		this.setName("Movie");
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("동영상을 재생합니다");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
	}
}