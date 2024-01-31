package sec02.exam02;

public class FloatDoubleExample {
	public static void main(String[] args) {
		float num1 = 123.45678912345678912345f;
		double num2 = 123.45678912345678912345;
			
		System.out.println("float형 변수 num1 : " + num1);
		System.out.println("double형 변수 num2 : "+ num2);
		double var = 0.1;
		for(int i = 0; i < 10; i++) {//10회 반복
			var += 0.1;
		}
		System.out.println(var);
	}

}
