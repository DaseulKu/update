package chap09.sec01.verify;

public class NestedClassEx {
// 03번
	public static void main(String[] args) {
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire();
		Car.Engine engine = new Car.Engine();
	}

}
