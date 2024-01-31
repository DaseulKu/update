package sec05.exam02;

import java.util.Scanner;

public class ArrInArrEx {

	public static void main(String[] args) {
		int sum = 0;
//		int count=0;
		double avg;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수1 입력:");
		int n1 = scan.nextInt();
		System.out.print("정수2 입력:");
		int n2 = scan.nextInt();		
		int [][]scores = new int[n1][n2];
		
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				System.out.printf("(%d, %d) 입력:",i,j);
				scores[i][j] = scan.nextInt();
				
			}
		}
//		for(int i=0; i<scores.length; i++) {
//			for(int j=0; j<scores[i].length; j++) {
//				sum += scores[i][j];
//				count++;
//			}
//		}
		for(int[]arr : scores) {
			for(int val : arr) {
				sum += val;
			}
		}
		avg = sum / (double)(n1*n2);
		System.out.println("총합:"+sum);
		System.out.println("평균:"+avg);
	}

}
