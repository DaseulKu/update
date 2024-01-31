package sec03.exam02;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		//논리연산자
		int charCode = 'A';
		if ((charCode >= 65) & (charCode <= 90)) {//꼭! 두 개를 평가해서
			System.out.println("대문자군요");
		}
		if ((charCode >= 97) && (charCode <= 122)) {//앞에꺼F면F
			System.out.println("소문자군요");
		}
		if (!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0~9숫자군요");
		}
		int value = 6;

		if ((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2또는3의 배수군요");
		}
		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2또는3의 배수군요");
		}
	}
}