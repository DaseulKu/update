package chap11.sec01.exam02;

public class StringTrimEx {

	public static void main(String[] args) {
		// str.trim() 문자열 앞뒤공백제거
		String str = "     가나 다            ";
		System.out.println(str.length());
		System.out.println(str.trim().length());

		// String.valueOf() 기본타입 값을 문자열로 변환
		String str1 = String.valueOf(10); // 10+"";
		System.out.println(str1+30);
	}
}