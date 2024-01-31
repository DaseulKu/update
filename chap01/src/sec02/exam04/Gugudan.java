package sec02.exam04;

import java.util.Scanner;

//단을 입력 받아서 구구단을 출력하세요
public class Gugudan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("단 입력>");
		int dan = scan.nextInt();
		for (int j=1; j <= 9; j++) {
			for(int i=dan; i <= 9; i++) { 
				System.out.printf("%d x %d = %d\t", i, j, i*j);
			}
			System.out.println();
		}
		scan.close();
	}

}
