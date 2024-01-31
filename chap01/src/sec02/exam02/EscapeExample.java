package sec02.exam02;

public class EscapeExample {
// \역슬레시가 붙은 문자=이스케이프문자
	public static void main(String[] args) {
		System.out.println("번호\t이름\t직업");// \t 탭만큼띄움
		System.out.println("행 단위 출력\n");// \n 줄바꿈(라인피드)
		System.out.println("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다.");// \"  "출력
		System.out.println("봄\\여름\\가을\\겨울");// \\  \출력
	}

}
