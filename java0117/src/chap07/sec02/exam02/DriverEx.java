package chap07.sec02.exam02;

import java.util.Scanner;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
//		driver.driver(bus); // driver.driver(new Bus());
//		driver.driver(taxi); // driver.driver(new Taxi());
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이동할 차량을 선택하세요 (1.버스|2.택시)");
		System.out.print("번호: ");
		int num = Integer.parseInt(scan.nextLine());
		Vehicle vehicle = null;
		switch (num) {
		case 1:
			vehicle = new Bus();
			break;
		case 2:
			vehicle = new Taxi();
			break;
			default:
				break;
		}
		driver.driver(vehicle);
	}
}