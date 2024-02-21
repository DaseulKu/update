package chap14.sec01.exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx2 {

	public static void main(String[] args) {
		try (InputStream is = new FileInputStream("c:temp/test2.db");) {
			byte[] buffer = new byte[100];
			while (true) {
				int readByteNum = is.read(buffer);
				if (readByteNum == -1) {
					break;
				}
				for (int i=0; i<readByteNum; i++) { // 읽은 바이트 수만큼 반복하면서 배열에 저장된 바이트 출력
					System.out.println(buffer[i]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
