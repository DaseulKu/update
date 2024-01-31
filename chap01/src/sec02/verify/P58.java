package sec02.verify;

public class P58 {

	public static void main(String[] args) {
		//3번
		//int sum;
		//int score1 = 0;
		//int score2;
		//sum = score1 + score2;
		
		
		int v1 = 0;
		if(true) {
			int v2 = 0;
			if(true) {
				int v3 =0;
				v1 = 1;
				v2 = 1;
				v3 = 1;
			}
//			v1 = v2 + v3; // 메소드 벗어나서 코딩 x
		}
		System.out.println(v1);
	}

}
