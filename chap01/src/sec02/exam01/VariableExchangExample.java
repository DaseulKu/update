package sec02.exam01;

public class VariableExchangExample {

	public static void main(String[] args) {
		//int x = 3;
		//int y = 5;
		//System.out.println("x:" +x+ ", y:" +y);
		
		//int temp = x;
		//x = y;
		//y = temp;
		//System.out.println("x:" +x+ ", y:" +y);
		
		//자료교환(swap)
				int x = 10;
				int y = 20;
				int a = 0;
				
				System.out.printf("x는 %d, y는 %d\n", x, y);
		//printf=프린트포멧
				a = x;
				x = y;
				y = a;
				System.out.printf("x는 %d, y는 %d\n", x, y);
	}

}
