package sec05.exam02;

public class Computer {
	int sum1(int[]values) {
		int sum = 0;
		for(int val : values) {
			sum += val;
			
//		for(int i=0; i<values.length; i++) {
//			sum += values[i];
		}
		return sum;
	}
	int sum2(int ... values) {
		int sum = 0;
		for(int val : values) {
			sum += val;
			
//		for(int i=0; i<values.length; i++) {
//			sum += values[i];
		}
		return sum;
	}
}


//sum1: int[] values라는 배열을 받아 각 요소의 합계를 계산하는 메서드
//sum2: 가변 인자 int... values를 받아 각 값의 합계를 계산하는 메서드 
//가변 인자는 배열로 전달되지만 호출할 때 배열을 명시적으로 생성하지 않고 
//여러 개의 인자를 콤마로 구분하여 전달 가능