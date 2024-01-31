package sec02.test01;
//두 수를 입력 받아서 합을 구하시오.
import java.util.Scanner;

public class Sum2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//입력을 위한 준비
		
		System.out.print("숫자 입력>");//처리(UI)
		int num1 = Integer.parseInt(scan.nextLine());//입력
		System.out.print("숫자 입력>");//처리(UI)
		int num2 = Integer.parseInt(scan.nextLine());//입력
		int sum = num1 + num2; //계산
		System.out.printf("두 수의 합은 %d\n", sum); //출력
		
	}

}
