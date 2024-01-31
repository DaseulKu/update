package sec02.exam04;

import java.io.IOException;

public class QStopKeyCodeExample {

	public static void main(String[] args) throws IOException {
		int keyCode;
		
		for(;;) {
			System.out.print("입력>");
			keyCode = System.in.read();
			System.out.println(keyCode);
			if(keyCode == 113) {//q 입력
				break;
			}
		}
		
		System.out.println("종료");
	}

}
