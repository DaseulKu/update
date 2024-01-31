package sec06.exam04;

public class Cal {
	static int sx; //객체 생성과 상관 x 메소드 영역에 생긴거임
	int x; //필드
		
	void power() {//메소드(static 아님)객체마다 각각 힙영역 생김
		System.out.println("전원을 켭니다");
		System.out.println("sx: "+sx);
	}
	
	void printX() {
		System.out.println(x);
	}
}
