package sec05.pdf01;

public class Exam05 {

	public static void main(String[] args) {
		int[][]array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
				
		};
		int sum = 0, count = 0;
		double avg = 0.0;
		
		for(int[]arr : array) {
			for(int val : arr) {
				sum += val;
				count++;
			}
		}
		avg = sum / (double)count;
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);
	}

}
