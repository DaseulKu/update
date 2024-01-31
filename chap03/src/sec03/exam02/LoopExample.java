package sec03.exam02;

public class LoopExample {

	public static void main(String[] args) {
		// 제어문을 이용한 논리 연산자
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		int k = 0;
		for (; k < 10;) {
			System.out.println(k);
			k++;
		}
		int y = 0;
		for (;;) {
			if (y >= 10) {
				break;
			}
			System.out.println(y);
			y++;
			int i = 0;
			while (i < 10) {
				System.out.println(i);
				i++;
			}
			int j = 0;
			do {
				System.out.println(j);
				j++;
			} while (j < 10);
		}
	}
}
