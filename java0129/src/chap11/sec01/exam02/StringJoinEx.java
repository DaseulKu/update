package chap11.sec01.exam02;

import java.util.ArrayList;
import java.util.List;

public class StringJoinEx {

	public static void main(String[] args) {
		//String.join(구분자,문자열) 로 이어 붙이기
		List<String> list = new ArrayList<>();
		list.add("나는");
		list.add("라면을");
		list.add("좋아합니다");
		String msg = String.join(" ", list); // list 에 있는거 공백(구분자)으로 붙이기
		System.out.println(msg);
		
		String msg2 = String.join(".", "www","naver","com");
		System.out.println(msg2);
	}

}
