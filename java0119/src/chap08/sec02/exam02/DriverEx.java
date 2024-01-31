package chap08.sec02.exam02;

public class DriverEx {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); // driver.driver(new Bus());
		driver.drive(taxi); // driver.driver(new Taxi());
	}
}