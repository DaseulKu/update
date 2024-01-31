package sec05.exam02;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {
		String[] arr = { "김사랑", "김하나", "김두울", "김세엣" };
//		String[] arr2 = arr; // 배열 복사가 아니라 같은 주소값 참조하는 변수
		String[] newArr = new String[arr.length];

		for (String str : newArr) {
			System.out.println(str);
		}
		System.arraycopy(arr, 0, newArr, 0, newArr.length);
		for (String str : newArr) {
			System.out.println(str);
		}
		String[] newArr1 = Arrays.copyOf(arr, arr.length);
		for (String str : newArr1) {
			System.out.println(str);
		}

	}
}
