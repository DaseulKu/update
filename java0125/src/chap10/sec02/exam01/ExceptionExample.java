package chap10.sec02.exam01;

class ThrowClass {
	void method(int x) throws Exception {
		if(x>10) {
		throw new Exception("예외발생"); // 새로운 예외를 생성하고 예외 메시지를 설정하여 던짐 (사용자 정의 예외)
		}else {
			System.out.println(x);
		}
	}
}
public class ExceptionExample {
	public static void main(String[] args) {
		ThrowClass tc = new ThrowClass();
		try {
			tc.method(11);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}