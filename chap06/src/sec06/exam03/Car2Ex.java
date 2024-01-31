package sec06.exam03;

public class Car2Ex {

	public static void main(String[] args) {
		String str = "가나다"; // 지역 변수
		
		
		Car2 car3 = new Car2("현대자동차");
		System.out.println(car3);
		
		Car2 car2 = new Car2();
		System.out.println(car2);
		
		//객체 생성
		Car2 car = new Car2();
		car.company = "KIA";
		car.color = "red";
		car.model = "K7";
		car.maxSpeed = 200;
		
		System.out.println(car);
	}

}
