package chap10.sec01.exam01;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		int[]arr = new int[4];
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
//		System.out.println(arr[4]); new int[4] 해서 0,1,2,3 까지만 있는데 4번 프린트 하려고 해서 index 범위 초과
	}

}
