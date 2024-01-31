package chap11.sec01.exam01;

public class SystemTimeEx {
// 주로 프로그램의 실행 소요 시간 측정하는데 쓴다 성능 평가할 때 활용할 수 있다
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		long time3 = System.currentTimeMillis();
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum +=i;
		}
		long time2 = System.nanoTime();
		long time4 = System.currentTimeMillis();
		
		System.out.println("1~1000000까지의 합: "+sum);
		System.out.println("계산에 "+(time2-time1)+" 나노초가 소요되었습니다");
		System.out.println("계산에 "+(time4-time3)+" 밀리언초가 소요되었습니다");
	}
}