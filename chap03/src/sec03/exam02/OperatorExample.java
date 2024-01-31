package sec03.exam02;

public class OperatorExample {

	public static void main(String[] args) {
		//비교 연산자
		System.out.println(0.1 == 0.1f);//F
		System.out.println((float)0.1 == 0.1f);//강제 형변환해서 T
		System.out.println(3 == 3.0);//T
		System.out.println('A' == 65);//T
		System.out.println("--------------------");
		
		//boolean 을 사용해서 참,거짓 나타내기도 가능하고 
		boolean b1 = 65<66;
//		System.out.println(65<66);리터럴로 해도 가능
		
		int num2 = 'B'-'A';
		System.out.println(num2);
		
		//문자열 결합 연산자
		String str = "JDK"+3+3.0;
		System.out.println(str);
		//char 타입의 산술 연산
		for (int i=0; i<10; i++) {
			char c1 = (char) ('A'+i);
			System.out.print(c1);
			
		}
		char c1 = 'A'+1;
		System.out.println(c1);
		System.out.println("--------------------");
		
		//증감 연산자
		for (int i=1; i<10; i++) {
			if(i%2 == 0) { //i가 2로 나누어 떨어진다면 조건문내의 코드블록 실행(i % 2의 값이 0이라면),(즉 i가 짝수인지 아닌지=2의배수)
				System.out.println(i);
			}
		}
		System.out.println("--------------------");
		
		int num = 10 % 3; // %는 10 나누기 3 나머지 값
		System.out.println(num);
		
		//논리부정연산자
		boolean play = true;
		System.out.println(!play); //boolean은 참,거짓만 나타내고 !는 논리부정연산자로 F를T로,T를F롤 산출
		
		
		
		int x = 1;
		int y = 1;
//		++ 는 다른 연산을 수행하기 전에 피연산자의 값을 1씩 증가시킴(--는 감소)
		int result1 = ++x + 10; //변수 x 1을 1증가 시키고 +10 해서 12
		System.out.println(result1);
		int result2 = y++ + 10; 
		//변수 y 1에 +10을 먼저하고 y를 1 증가해서 나중에 y가 증가된 것은 결과 값에 영향을 주지 않기 때문에 11이 나온다
		System.out.println(result2);
		
		System.out.println("x:"+x+", y:"+y);
		
//		부호연산자
		byte b = 100;
//		byte result = -b; //-1 * b = 연산 결과가 정수임
		

	}

}
