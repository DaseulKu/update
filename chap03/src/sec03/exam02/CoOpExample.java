package sec03.exam02;

public class CoOpExample {

	public static void main(String[] args) {
		// 삼항 연산자
		int score = 95;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다");

//	char grade;
//	String grade = score>90?"A":score>80?"B":"C";
//	if(score>90) {
//		grade = 'A';
//	}else {
//		grade = 'B';
//	}else {
//		grade = 'C';
//	}

	}
}