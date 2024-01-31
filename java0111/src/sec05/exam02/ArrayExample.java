package sec05.exam02;

public class ArrayExample {
	public static void printArr(int a[]) {
		for(int n : a) {
			System.out.print(n+",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int sum = 0, max = 0;
		double avg;
		int[] a = { 1, 3, 10, 2, 8 };
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			if (max < a[i]) {
				max = a[i];

			}

		}
		System.out.println("max:" + max);
		System.out.println("sum:" + sum);
		avg = sum / (double) a.length;
		System.out.println("avg: " + avg);
		
		for(int i=0; i<a.length; i++) {
			System.out.println("i="+i+":");
			for(int j=a.length-1; j>i; j--) {
				if(a[j] < a[j-1]) {					
					int tmp = a[j];
					a[j] = a[j-1];
					a[j-1] = tmp;
					System.out.print("\t교환(j-1="+(j-1)+", j="+j+")");
					
				}				
			}
			
			printArr(a);
		}

		int b[] = { 10, 3, 1, 4, 2 };
		int c = -1;
		for (int i = 0; i < a.length; i++) {

			if (b[i] == 4) {
				c = i;
			}
		}
		if(c != -1) {
		System.out.println("값이 4가 있는 인덱스: " + c);
		}else {
			System.out.println("못찾음");
		}
		int x = 10;
		int y = 20;

		int tmp = x;
		x = y;
		y = tmp;

	}

}
