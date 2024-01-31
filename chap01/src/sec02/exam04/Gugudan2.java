package sec02.exam04;

import java.util.Scanner;

public class Gugudan2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		for (;;) {
			System.out.println("단을 입력(종료시 q) : ");
			str = scan.nextLine();
			if (str.equals("q")) {
				break;
			}
			int dan = Integer.parseInt(str);
			for (int i=1; i <= 9; i++) {
				System.out.printf("%d x %d = %d\n", dan, i ,dan*i);
			}
		}
		System.out.println("종료");
	}

}
