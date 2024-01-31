package sec02.exam01;

public class VariableIntializationExample {

	public static void main(String[] args) {
		
		int value = 30; 
// int value; 변수 초기화가 안되서 에러
//int value = 30; 이라고 변수를 초기화 해줘야한다
		
		int result = value + 10;
//변수를 초기화하지 않으면 여기서 value 값이 없어서 에러
		
		System.out.println(result);
		
	}

}
