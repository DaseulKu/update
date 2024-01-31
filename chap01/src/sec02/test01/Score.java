package sec02.test01;
//5명의 점수를 입력받아서 90~100=A, 80~89=B, 70~79=C, 70미만=F 을 출력하세요
import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력>");
		int score = scan.nextInt();
		char grade;
		
		 if (score >= 90 && score <= 100) {
	            grade = 'A';
	        } else if (score >= 80) {
	            grade = 'B';
	        } else if (score >= 70) {
	            grade = 'C';
	        } else {
	            grade = 'F';
	        }

	        System.out.println("학점은 " +grade+ " 입니다.");
	    }
	}