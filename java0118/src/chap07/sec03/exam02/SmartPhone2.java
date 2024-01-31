package chap07.sec03.exam02;

public class SmartPhone2 extends Phone{
	int y;

	public SmartPhone2(int x,int y) {
		super(x); // 부모의 생성자 호출
		this.y = y;
	}
	public void printX() {
		System.out.println(x);
	}
	@Override
	public String ring(int tel) {
		// TODO Auto-generated method stub
		return null;
	}
}
