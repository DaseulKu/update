package chap10.sec02.exam01;

class MyClass{
	void method() throws MyException {
		throw new MyException("내가 만든 예외 발생");
	}
}
public class ExceptionEx {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		try {
			mc.method();
		} catch (MyException e) {
			
			e.printStackTrace();
		}

	}

}
