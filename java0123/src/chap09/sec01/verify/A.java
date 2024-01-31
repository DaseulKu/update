package chap09.sec01.verify;

public class A {
	
	void method(int x) {
		String y = "yyy"; // 로컬 클래스 필드
		class Inner{
			void method() {
				String z = x+y; // 2번에 4번 final 큭성을 가진 배개변수나 로컬변수만 로컬 클래스 내부에서 사용할 수 있다
			}
		}
	}
	
	int x = 100;
	
	static class B{
		void method() { // 1번에 4번 정적 멤버 클래스 내부에는 바깥 클래스의 인스턴스 필드를 사용할 수 없다
//			System.out.println(A.this.x);
		}
	}
}
