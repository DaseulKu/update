package sec05.exam02;

public class Exam05 {

	public static void main(String[] args) {//합과평균구하기
//		double[]array2 = {80,78,97};//아랫줄이랑 똑같은말인데 이건 리터럴로받은거
		double[]array = new double[] {83, 90, 87};
		
		double sum = 0;
		double avg;
		
		for(double num : array) {
			sum += num;
			
		}
		System.out.println("총합: "+sum);
		avg = (double)sum/array.length;
		System.out.println("평균: "+avg);
	}
	
}