package sec06.exam02;

public class Car2EX {
//외부 클래스에서 Car2 필드값 읽기와 변경
	public static void main(String[] args) {
		//객체 생성
		Car2 myCar = new Car2();
		//필드값 읽기
		System.out.println("제작회사: "+myCar.company);
		System.out.println("모델명: "+myCar.model);
		System.out.println("색깔: "+myCar.color);
		System.out.println("최고속도: "+myCar.maxSpeed);
		System.out.println("현재속도: "+myCar.speed); //필드 선언시 초기 값 안줬는데 기본값 0이 저장 되있음

		myCar.speed = 60;//필드 값 변경
		System.out.println("수정된 속도: "+myCar.speed);
	}

}
