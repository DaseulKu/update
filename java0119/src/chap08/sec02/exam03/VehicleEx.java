package chap08.sec02.exam03;

import java.util.ArrayList;
import java.util.List;

class MyClass{}
interface Inter{}
class Acc{
	Inter inter;
	MyClass mc = new MyClass();
	int x;
	String str;
	String method() {
		return str;
	}
}
public class VehicleEx {

	public static void main(String[] args) {
		new Bus().checkFare(); // 변수X
		
		
		Vehicle vehicle = new Bus();
		vehicle.run();
//		vehicle.checkFare(); vehicle 인터페이스에는 checkFare()가 없음
		if(vehicle instanceof Bus) {
			System.out.println("가능");
		}
		Bus bus = (Bus)vehicle;
		bus.checkFare(); 
		
		String str = new String ("테스트");
		String str1 = "";
		for(int i=0; i<100; i++) { 
			str1 += str;
		}
		System.out.println(str1);
		List <Acc> list = new ArrayList<>();
//		list.add(123);
//		list.add("문자열");
//		list.add(3.14);
		list.add(new Acc());
		
		for(Object obj : list) {
			Acc acc = (Acc)obj ;
			System.out.println(acc);
		}
		
		
	}
}
