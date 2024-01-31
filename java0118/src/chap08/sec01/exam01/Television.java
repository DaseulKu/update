package chap08.sec01.exam01;

public class Television implements RemoteControl {
	private int volume; // 필드
	@Override
	public void turnOn() { // 추상 메소드의 실체 메소드
		System.out.println("TV를 켭니다");
	}
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}
	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) { //인터페이스 상수를 이용해서 volume 필드 값 제한
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
}