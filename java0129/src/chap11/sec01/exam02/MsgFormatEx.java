package chap11.sec01.exam02;

import java.text.MessageFormat;

public class MsgFormatEx {

	public static void main(String[] args) {
		int n = 13;
		String p = "사과";
		String msg = MessageFormat.format("나는 {1}를 {0}개 가졌다",p,n);
		System.out.println(msg); // 타입에 상관없이 출력

		String str = String.format("나는 %s를 %d개 가졌다",p,n);
		System.out.println(str);
	}

}
