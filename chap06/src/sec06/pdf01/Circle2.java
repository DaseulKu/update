package sec06.pdf01;

public class Circle2 {
	
	int radius;
	
	public Circle2 (int radius) {//생성자 > 필드 초기화 > 생성자를 다시 부르는 것은 또 다른 객체를 생성하는거다
		this.radius = radius;
	}
	void set(int radius) {//계속 가져와서 사용 가능, radius를 변경하는 메서드
		this.radius = radius;
	}
	public static void main(String[] args) {
		Circle2 cir1 = new Circle2(2);
		System.out.println(cir1.radius);
//		Circle2 cir2 = cir1; //주소 값만 복사
		
		cir1.set(4);
		System.out.println(cir1.radius);
		cir1.set(5);
		System.out.println(cir1.radius);
		cir1.set(6);
		System.out.println(cir1.radius);

	}

}
