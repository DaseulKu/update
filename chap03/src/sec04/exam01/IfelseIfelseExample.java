package sec04.exam01;

import java.util.Scanner;

public class IfelseIfelseExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수>");
		int score = scan.nextInt();
		if(score<=100&&score>=0) {
			if(score>=90) {			
				System.out.println("등급은 A입니다");
			}else if(score>=80) {
				System.out.println("등급은 B입니다");
			}else if(score>=70) {
				System.out.println("등급은 C입니다");
			}else{
				System.out.println("등급은 D입니다");
			}
		}else{
			System.out.println("점수오류");
		}
	}
}