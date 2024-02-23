package chap14.sec01.exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx3 {

	public static void main(String[] args) {
		try (InputStream is = new FileInputStream("c:temp/test3.db");) {
			byte[] buffer = new byte[5];
			int readByteNum = is.read(buffer, 2, 3);
			if (readByteNum != -1) {
				for (int i=0; i<buffer.length; i++) {
					System.out.println(buffer[i]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}