package chap14.sec01.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx {

	public static void main(String[] args) {
		try (OutputStream os = new FileOutputStream("c:temp/test1.db")) {
			// 데이터 도착지를 test1.db 로 하는 바이트 기반 파일 출력 스트림 생성
			byte a = 10; byte b = 20; byte c = 30;
			//1byte 씩 출력
			os.write(a); os.write(b); os.write(c);
			// 출력 버퍼에 잔류하는 모든 바이트 출력
			os.flush();
			
		}catch(IOException e) {
			
		}
	}
}