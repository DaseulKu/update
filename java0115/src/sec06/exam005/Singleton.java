package sec06.exam005;

public class Singleton {
	//private 접근제한은 자신 클래스 내에서만 접근 가능
	private static Singleton singleton = new Singleton(); // 자신의 타입인 정적 필드 선언 > 자신의 객체를 생설해 초기화
	private Singleton() {} // 생성자를 private 로 하는 이유는 다른 생성자를 생성할 수 없게 하는 것
	public static Singleton getInstance() { // 외부에서 객체를 얻는 유일한 방법은 이 메소드로 호출
		return singleton;
	}
}
