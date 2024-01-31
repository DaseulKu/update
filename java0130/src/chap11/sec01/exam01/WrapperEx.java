package chap11.sec01.exam01;

public class WrapperEx {
	public static void main(String[] args) {
		// 포장 값 비교 직접 내부 값을 언박싱해서 비교할 때 equals() 메소드 사용
		Integer num1 = new Integer(3);
		Integer num2 = new Integer(3);
		System.out.println(num1==num2);
		System.out.println(num1.equals(num2));
		
		int x = 100;
		String str = "가나다";
		
		// Boxing : 기본 타입의 값을 포장(wrapper) 객체로 만드는 과정
		Integer obj2 = Integer.valueOf("100"); //생성자 이용 X valueOf()메소드사용
		Integer obj1 = 300; // 자동박싱 : 포장클래스타입에 기본값이 대입될 경우 발생
		System.out.println(obj1);
		
		// Unboxing : 포장객체에서 기본 타입의 값을 얻는 과정
		int y = obj1.intValue(); // 기본타입이름+Value() 메소드호출
		System.out.println(y);
		int z = x + obj1;
		System.out.println(z);
		
		System.out.println(x==obj2);
		System.out.println(x!=obj1);
	}
}