package com.proj;

public class MethodExample {
//return
	public static String input(){//선언부 이 부분 위치 상관 x ,main 안에는 안되고 밖에
		String str = "aaa";
		return str;
	}
	public static void main(String[] args) {
		String str = input(); //호출(실행)
		System.out.println(str);

	}

}
