package chap09.sec02.exam01;

interface Inter{
	void disp();
}
public class Ex2 {

	public static void main(String[] args) {
		Inter it = new Inter() {
			int y = 100; // 익명 객체 필드
			public void disp2() { //익명 객체 메소드
				System.out.println("disp2");
			}
			@Override
			public void disp() {
				System.out.println(y);	
			}
		};//익명구현객체
		it.disp();
	}
}