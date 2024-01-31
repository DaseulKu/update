package sec06.exam03;
//생성자 필드에서 초기화
public class Korean {
	//필드
	String nation = "대한민국"; //필드를 선언하면서 초기값을 줌
	String name;//객체 생성 시점에 외부에서 제공되는 값들로 초기화하려고
	String ssn;
	
	//생성자
	public Korean(String n, String s) {
		name = n;//생성자의 매개값으로 이 값을 초기화
		ssn = s;
	}

}
