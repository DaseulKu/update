package sec02.exam02;

public class CharExample {

		//작은 따옴표로 감싼 것을 문자 리터럴이라고 함 그것은 유니코드로 변환되어 저장
	public static void main(String[] args) {
			char c1 = 'A';
			char c2 = 65;
			char c3 = '\u0041';
			
			char c4 = '가';
			char c5 = 44032;
			char c6 = '\uac00';
			
			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c3);
			System.out.println(c4);
			System.out.println(c5);
			System.out.println(c6);
			
		}

	}
