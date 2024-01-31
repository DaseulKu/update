package sec02.exam04;

import java.util.Random;

public class LottoExample {

	public static void main(String[] args) {
//		System.out.println(Math.PI);
//		난수발생1번
		for (int i=0; i<6; i++) {
		int num = (int) (Math.random()*45+1);
		System.out.println(num);//난수발생
		}
		System.out.println("--------------");
		
//		난수발생2번
		Random rd = new Random();
		for (int i=0; i<6; i++) {
//			System.out.println(rd.nextInt(10));//0~9
//			System.out.println(rd.nextInt(10));//1~10
			System.out.println(rd.nextInt(45)+1);//1~45
		}
	}

}
