package sec06.exam04;

import java.util.Scanner;

public class Sum {

	public static void multi(Scanner scanner) {// 곱셈 메서드
		System.out.print("첫번째 수:");
		String strNum1 = scanner.nextLine();
		System.out.print("두번째 수:");
		String strNum2 = scanner.nextLine();
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 * num2;
		System.out.println("곱셈 결과:" + result);

	}

	public static void sum(Scanner scanner) { // 덧셈 메서드

		System.out.print("첫번째 수:");
		String strNum1 = scanner.nextLine();
		System.out.print("두번째 수:");
		String strNum2 = scanner.nextLine();
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과:" + result);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		sum(scanner);// 덧셈 메서드 호출
		multi(scanner);// 곱셈 메서드 호출

	}

}
