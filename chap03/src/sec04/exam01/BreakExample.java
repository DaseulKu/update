package sec04.exam01;

public class BreakExample {
	public static void main(String[] args) {
		for(int i=0;i<100; i++) {
			if(i==55) {
//				System.out.println(i);
			break;
			}
			System.out.println(i); 
		}
		System.out.println("종료");
	}
}
