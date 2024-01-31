package chap10.sec01.exam01;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {
		try {
			int x = Integer.parseInt("aa");
			System.out.println(x);

		} catch (NumberFormatException e) {
			System.out.println("숫자 반환 불가");
		}

	}

}
