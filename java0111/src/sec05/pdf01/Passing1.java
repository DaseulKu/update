package sec05.pdf01;

public class Passing1 {

	public static void main(String[] args) {
		int x =100;//지역변수 : 해당 블럭에서만 생존
		x = method1(x);//메소드 호출		
		System.out.println("x값:"+x);
	}

	public static int method1(int y) {//메소드
		//y도 지역변수 (단, 호출한 곳에서 값을 넘겨줘야 한다)
		y += 1;
		return y; //리턴
	}
	
}
