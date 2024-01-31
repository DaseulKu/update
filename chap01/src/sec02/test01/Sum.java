package sec02.test01;
//1부터 10까지의 합계를 구하시오
public class Sum {

	public static void main(String[] args) {
		int sum =0;
		int start = 1;
		int end = 10;
		
		for (int i=start; i <= end; i++) {
			//System.out.println("i:"+i);
			sum += i; //sum = sum + i;와 같다
//			System.out.println("sum:"+sum);
		}
		System.out.println(start+"부터 "+end+"까지의 합계: "+sum);
	}

}