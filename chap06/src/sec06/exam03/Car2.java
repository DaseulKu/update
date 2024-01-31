package sec06.exam03;

public class Car2 {//클래스 선언 = 설계도 만듦
	//필드(변수 아님 this. 할때 이걸 불러오는거임
	String company; //객체의 성격
	String model;
	String color;
	int maxSpeed;
	
	public Car2() {//생성자 선언
		System.out.println("Car()");
		
	}
	
	public Car2(String str) {
		company = str;
		
	}
	public Car2(String str, String str1) {
		company = str;
		model = str1;		
	}
	
	
	public Car2(String company, int maxSpeed) {
		this.company = company;
		this.maxSpeed = maxSpeed;
	}

	public Car2(String company, String model, String color, int maxSpeed) {
		
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}
	
	

}
