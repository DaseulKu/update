package chap07.sec01.exam01;

class Aa{
	private int y;
	final int x;
	void method() {}
	Aa(){
		this.x = 0;
	}
	Aa(int x) {
		this.x = x;
	}
	Aa(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Bb extends Aa{
	
	void method() {
//		x = 40; final 필드값 변경 X
//		System.out.println(y); private 접근 X
	}
}
