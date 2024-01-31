package chap11.sec01.verify;

public class Exam {

	public static void main(String[] args) {
		int[] arr = { 5, 23, 1, 43, 100, 200, 40 };
		for (int i=0; i < arr.length; i++) {
			for (int j = i + 1; j <arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = 0;
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}

	}

}
