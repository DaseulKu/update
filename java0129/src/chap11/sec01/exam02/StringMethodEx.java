package chap11.sec01.exam02;

import java.io.UnsupportedEncodingException;

public class StringMethodEx {
	public static void main(String[] args) {
		// String 메소드 문자추출 charAt()
		String sub = "자바 프로그래밍";
		System.out.println(sub.charAt(3)); // 3번인덱스위치의 문자
		// 바이트 배열을 문자열로 전환
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		String strr = new String(bytes, 0, 5); // 0번 인덱스부터 다섯개
		System.out.println(strr);
		// char 배열을 문자열로 전환
		char[] chars = { 'H', 'e', 'l', 'l', 'o' };
		strr = new String(chars);
		System.out.println(strr);
		
		String str = "안녕하세요abc";
		//문자열대치 replace()
		String nstr = str.replace("abc", "감사합니다");
		System.out.println("str.replace: "+nstr);
		System.out.println("str안바뀜> "+str);
		// 문자열찾기 indexOf()
		int index = str.indexOf("가요");
		System.out.println("str.indexOf: "+index);
		// 못찾으면 -1 리턴 if(문자열.indexOf("찾는문자열") != -1) 이렇게 문자열 포함여부 조사가능
		index = "안녕하세요abc".indexOf("세요");
		System.out.println("안녕하세요abc.indexOf"+index);
		// 바이트배열로변환 getBytes() , 문자열 길이 length()
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1->String: " + str1);

		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2->String: " + str2);

			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3->String: " + str3);

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}