package chap14.sec01.exam02;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteEx {

	public static void main(String[] args) {
		try (Writer writer = new FileWriter("c:temp/test7.db");){
			char a = 'A'; char b = 'B'; char c = 'C';
			
			writer.write(a); writer.write(b); writer.write(c);
			
			writer.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
