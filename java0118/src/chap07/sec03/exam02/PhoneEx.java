package chap07.sec03.exam02;

public class PhoneEx {

	public static void main(String[] args) {
		Phone phone = new SmartPhone2(10,20);
		System.out.println(phone.x);
		
		if(phone instanceof SmartPhone) {
			SmartPhone sp = (SmartPhone) phone;
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
	}

}
