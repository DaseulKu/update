package sec05.exam02;

import java.util.Scanner;

public class Exam04 {//최대값구하기

	public static void main(String[] args) {
		int max = 0;				
		Scanner scan = new Scanner(System.in);
		System.out.println("입력할 개수:");
		int count = scan.nextInt();
		int[]intNum = new int[count];
		
		for(int i=0; i<intNum.length; i++) {
			System.out.print("정수입력: ");
			intNum[i] = scan.nextInt();
			
		}
		for(int val : intNum) {
			if (max < val) {
				max = val;
			}
		}
		System.out.println("최대값: "+max);
//		
//		max = 0;
//		int index = 0;
//		int[] array = {1, 5, 3, 8, 2};		
//		int j = 0;
//		for(int num : array) {
//			
//			if(max < num) {
//				max = num;
//				index=j;
//			}
//			j++;
//		}
//		
//		for (int j=0; j < array.length; j++) {
//			if (max < array[j]) {//max값과 배열의값을 비교
//				max = array[j]; //max보다 큰값을 max에 저장
//				index = j;
//			}
//		}
//		System.out.println("최대값: "+ max);
//		System.out.println("인덱스: "+ index);
//		
		
	}
}
