package sec06.exam005;

public class Person {
	final static public double PI1 = 3.141592; // 상수 : 불변의 값을 저장하는 필드
	public static final double PI = 3.141592;
	final String name;
	
	public Person(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		System.out.println(Math.PI);
		Person person = new Person("홍길동");
//		person.name = "홍길동";

		final int x; 
		x = 300;
//		x = 500; final 은 한 번 초기화되면 수정 할 수 없음
	}

}
