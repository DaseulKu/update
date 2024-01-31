package chap11.sec01.exam02;

public class StringEx {

	public static void main(String[] args) {
		String aaa = "aaa";
		String bbb = "bbb";
		
		// 1 StringBuilder()
		StringBuilder sb = new StringBuilder();
		sb.append(aaa);
		sb.append(bbb);
		System.out.println(sb);

		// 2 + 로 문자열 결합
		String str = aaa + bbb;
		System.out.println(str);
		
		// 3 concat() 문자열 이어붙이기
		String str1 = aaa.concat(bbb);
		System.out.println(str1);
	}

}
