package sec06.exam005;

public class Cal {
	static int x;
	static int p1(){
		return x+100;
	}
	static int m1(){
		return x-100;
	}
	static void m2() {
		System.out.println(x);
	}
	public static void main(String[] args) {
		Cal ca = new Cal();
		ca.m2(); // 정상적인 사용법 x
		
		x = 100;
		int y = p1();
		System.out.println(y);
		Cal.m2(); // 객체 생성없이 접근 가능

	}

}
