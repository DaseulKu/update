package chap10.sec02.verify;

public class Prob {
	void method() {
		System.out.println("method()");
	}
	void method2() {
		try{//return; 여기다 쓰며 try 구문은 실행안하고 finally 는 실행한다
			method();
			return;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("method2()-finally");
		}
	
	}
	public static void main(String[] args) {
		Prob prob = new Prob();
		prob.method2();

	}

}
