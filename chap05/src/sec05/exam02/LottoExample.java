package sec05.exam02;

import java.util.Random;

public class LottoExample {

	public static void main(String[] args) {
		int[] lotto = new int[6]; //인덱스0~5 (6개)
		Random rand = new Random();
//		lotto[0]=rand.nextInt();
//		lotto[1]=rand.nextInt();
//		lotto[2]=rand.nextInt();
//		lotto[3]=rand.nextInt();
//		lotto[4]=rand.nextInt();
//		lotto[5]=rand.nextInt();
		
		for (int i=0; i < lotto.length; i++) {
			lotto[i] = rand.nextInt(45)+1;
			System.out.println(lotto[i]);
		}
		System.out.println("-------------------");
		for(int val : lotto) {//데이터타입 변수 : 배열
			System.out.println(val);
//배열에서 가져올 첫번째 값이 있으면 변수에 저장하고 실행문을 실행하고
//다시 루프르 돌아서 배열에서 가져올 다음값 확인하고 있으면 루프진행 없으면 for문 종료 
		}
	}

}
