package sec02.exam03;
//타입변환
public class TypeExample {

	public static void main(String[] args) {
//		문자열을 기본타입으로 강제 타입 변환
		String str4 = "3.14";//문자형태
		double value = Double.parseDouble(str4);//실수로
//		+연산으로자동타입변환
		String str2 = ""+10+2;//102 연산이 x
		System.out.println(str2);
		int num1 = Integer.parseInt(str2);//정수로만들기
		
		String str3 = ""+(10+2);//12 괄호 우선이라 연산 o
		System.out.println(str3);
		
		String str = 10+2+"";//12
		System.out.println(str);
		
		String str1 = String.valueOf(10+2);//문자열로만들기
//		강제타입변환
		System.out.println(1/2.0);//or(1.0/2)
		int x = 1;
		int y = 2;
		double result2 =x/(double)y;
		System.out.println(result2);
		
		byte value1 = 10;
		int value2 = 100;
		int sum = value1 + value2;
		
		int intValue = 10;
		double doubleValue = 5.5;
		int result = (int) (intValue + doubleValue);
		
		byte var1 = 127;
		int var2 = 129;
		long var3 = 10000000000L;
		float var4 = var3;
		
		var1 = (byte) var2;
		System.out.println(var1);

	}

}
