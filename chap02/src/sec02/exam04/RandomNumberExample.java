package sec02.exam04;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberExample {
	
	public static int createNumber(Random random) {
//		Random random = new Random();
		return random.nextInt(10)+1;
	}
	public static void multiplication() {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		int num1 = createNumber(random);
		int num2 = random.nextInt(10) + 1;

		int multi = num1 * num2;

		System.out.printf("%d x %d = ?\n", num1, num2);

		for (;;) {
			System.out.println("입력>");
//			int answer =scan.nextInt();
			int answer = Integer.parseInt(scan.nextLine());
			if (answer == multi) {
				System.out.println("정답입니다!");
				break;
			} else {
				System.out.println("오답입니다!");
			}
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			multiplication(); // 메소드 (multiplication)을 세번반복
		}
		System.out.println("종료");
	}
}
