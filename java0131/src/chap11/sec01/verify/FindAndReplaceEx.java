package chap11.sec01.verify;

public class FindAndReplaceEx {

	public static void main(String[] args) {
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1); // S > I
		
		int intData2 = 150;
		String strData2 = String.valueOf(intData2); // I > S
		
		String str = "모든 프로그램은 자바 언어로 개발될 수 있다";
		int index = str.indexOf("자바"); // 인덱스 확인
		System.out.println(index);
		str = str.replace("자바", "Java"); // 대치 = 초기값 초기화하고 새로운 문자열로
		System.out.println(str);
	}
}