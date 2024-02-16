package thread;

public class PrintThread extends Thread{
	private boolean stop; // stop 플래그 필드
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while(!stop) { // stop 필드 false 일 경우 while 문 true= 무한 반복
			System.out.println("실행중");
		}
		System.out.println("자원정리");
		System.out.println("실행종료");
	}
}