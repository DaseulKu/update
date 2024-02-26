package chap14.sec03.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class GetLineStringFromKeyboard {

	public static void main(String[] args) throws IOException {
//		InputStream 을 Reader 로 변환하고 다시 BufferedReader 연결
//		InputStream is = System.in;
//		Reader reader = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(reader);
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner br = new Scanner(System.in);
		while (true) {
			System.out.println("입력하세요");
//			String lineStr = br.readLine(); // 라인 단위로 문자열을 읽음
			String lineStr = br.nextLine();
			if (lineStr.equals("q") || lineStr.equals("quit")) { // q 또는 quit 를 읽었을 때 while 반복문 종료
				break;
			}
			System.out.println("입력된 내용: " + lineStr);
		}
		System.out.println("종료");
		br.close(); // 입력스트림 닫기
	}

}
