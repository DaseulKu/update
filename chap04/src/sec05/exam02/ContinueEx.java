package sec05.exam02;

import java.util.Scanner;

public class ContinueEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int[]arr = new int[] {1,2,3,4,5};
		int[]arr2 = null;
		
		System.out.print("크기:");
		int size = scan.nextInt();
		arr2 = new int[size];
//		int[]arr2 = new int[size];
		
//		arr = arr2;//힙에 있는 메모리 주소 값을 복사 
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		arr2[1] = 100;
		
		System.out.println(arr[1]);
		
//		for(int i=0; i<10; i++) {
//			System.out.println(i);
//			if(i==6) {//중괄호 안하면 밑이나 옆에 있는 실행문 하나만 함
//				continue;
//			}			
//			System.out.println("나올까요?");
//		}

	}

}
