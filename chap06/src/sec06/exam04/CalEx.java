package sec06.exam04;

public class CalEx {

	public static void main(String[] args) {
		Cal.sx = 500;
		Cal cal = new Cal(); //power 가 Static 이 아니라 객체 생성해야 호출
		cal.power();
		cal.x = 100;
		cal.printX();
		
		Cal cal2 = new Cal();
		System.out.println(cal2.x);
		cal2.power();
	}

}
