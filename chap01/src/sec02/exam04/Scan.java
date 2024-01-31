package sec02.exam04;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputData;
		
		while(true) {
			System.out.print("입력>");
			inputData = scan.nextLine(); //엔터키 값을 제외
			System.out.printf("입력된 문자열: %s\n", inputData);
			System.out.println(inputData.equals("q"));
			if (inputData.equals("q")){ //입력된 문자열이 q이면
				break; //반복문을 빠져나감

			}
		}
		System.out.println("종료");
	}
}