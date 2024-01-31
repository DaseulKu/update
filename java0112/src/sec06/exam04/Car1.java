package sec06.exam04;

public class Car1 {
	//필드
		int speed = 10;
		
		//생성자
		
		//메소드
		int getSpeed() {
			return speed;
		}
		
		void keyTurnOn() {
			System.out.println("시동 후"+speed+"km");
		}	
		
		void run() {
			for(int i=10; i<=50; i+=10) {
				speed = i; //i 값이 필드에 저장되니까 getSpeed 메소드에서 계속 변화 확인가능 
				System.out.println("달립니다.(속도:" + speed + "km/h)");
			}
		}	
}
