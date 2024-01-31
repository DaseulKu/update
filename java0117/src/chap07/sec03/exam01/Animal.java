package chap07.sec03.exam01;

public abstract class Animal { // 추상클래스
	public String kind;
	
	public void breathe(){
		System.out.println("숨은 쉰다");
	}
	
	public abstract void sound(); // 추상메소드
}
