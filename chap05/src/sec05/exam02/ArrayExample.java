package sec05.exam02;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
//		int[] scores =null;//스택 영역에만 존재하는데
//		System.out.println(scores.length);//힙영역에서 무언가를출력하려함
		
//		int[]scores = {83, 90, 87} //int에[]를붙이면참조타입이됨
//		System.out.println(scores.length);	
		Scanner scan = new Scanner(System.in);
		System.out.print("생성할 정수 배열의 개수:");
		int num = scan.nextInt();
		int[]scores = new int[num]; //힙 영역의 생성 갯수
//		scores[0] = 83;
//		scores[1] = 90;
//		scores[2] = 87;
//		System.out.println(scores[0]);
//		System.out.println(scores[1]);
//		System.out.println(scores[2]);
//		System.out.println(scores[3]); //에러
//		
//		for(int i=0; i<scores.length;i++) {
//			System.out.println(scores[i]);
//		}
//		String str = "abc";
//		System.out.println(str.length);
//		String[]names = new String[5];
//	
//		names[0] = str;
//		names[1] = "김하나";
//		names[2] = "강하나";
//		for(int i=0; i<names.length; i++) {
//			System.out.println(names[i]);
//		
	}
}

