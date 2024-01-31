package sec06.exam04;

public class Car1Ex {

	public static void main(String[] args) {
		Car1 myCar = new Car1();
		myCar.keyTurnOn();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");
		myCar.run();
		speed = myCar.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");
	}

}
