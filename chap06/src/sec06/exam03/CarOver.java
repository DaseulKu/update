package sec06.exam03;
//생성자 오버로딩
//외부에서 제공되는 다양한 요구 조건을 수용하기 위해 다양한 객체를 생성하도록  생성자 오버로딩함
//매개 변수를 다르게 한 생성자를 여러 개 선언
public class CarOver {
	//오버로딩이 많아지면 매개 변수의 수만 다르고 필드 초기화 내용이 비슷한 생성자에서 생성자 간의 중복된 코드 발생
	//필드 초기화 내용은 한 생성자에만 집중적으로 작성하고 나머지 생성자는 이것을 호출해서 사용하는 방법을 쓸 수 있음
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자1
	CarOver(){
		
	}
	//생성자2
	CarOver(String model){
		this.model = model;//생성자에서 다른 생성자 코드를 호출할 때 this() 코드 사용
	}
	//생성자3
	CarOver(String model, String color){
		this.model = model;//생성자 첫 줄에만 this() 코드 허용
		this.color = color;
	}
	//생성자4
	CarOver(String model, String color, int maxSpeed) {		
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	
	
	}
	
}
