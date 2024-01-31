package sec02.exam03;

public class IntegerLiteralExample {
	
	public static void main(String[] args) {
		byte var1 = -128;
//		byte var2 = -129;
		byte var3 = 127;
//		byte var4 = 128;
		
		short var5 = -32768;
//		short var6 = -32769;
		
		int var7 = 0b01111111; //0b로 시작 = 2진수
		System.out.println(var7);
		int var8 = 0x9;//0x로 시작 = 16진수
		System.out.println(var8);
		
		long var9 = 2150000000L;//기본적으로 정수 리터럴을 int로 인식해서 뒤에 L
//		int var10 = 2150000000;
		
		char var11 = '\uac00';
		int var12 = '각';
		System.out.println(var11);
		System.out.println(var12);
		
		double var13 = 1.8e307;
		float var14 = 0.25F;//기본적으로 실수 리터럴을 double로 인식해서 뒤에 F
		System.out.println(var13);
		
		String str = "가\"나\"\\다";
		System.out.println(str);
	}

}
