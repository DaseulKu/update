package stream;

public class StreamEx2 {

	public static void main(String[] args) {
		//String 에서 숫자만 추출해서 합 구하기
		String input = "1Ca2Adf9";
		int sum = input.chars()
				.filter(Character::isDigit)
				.map(a -> Character.digit(a, 10))
				.sum();
		
		System.out.println(sum);
				
	}

}
