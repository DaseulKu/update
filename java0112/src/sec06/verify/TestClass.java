package sec06.verify;
//P230 1번 필드는 클래스 블록 어디서든 선언할 수 있다?
public class TestClass {//생성자나 메소드 내부 제외
	
	
	public TestClass(int x) {
		this.x = x;
	}
	
	
	public void method1() {
		
	}
	int x;
	int y;
	String s;
}
