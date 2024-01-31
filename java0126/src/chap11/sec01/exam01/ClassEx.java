package chap11.sec01.exam01;

class Car{}
public class ClassEx {

	public static void main(String[] args) throws ClassNotFoundException {
		// 1 클래스로부터 얻기
		Class clazz = Car.class;
		String str = clazz.getResource("photo2.jpg").getPath(); // 절대 경로 얻기
		System.out.println(str);
		String str2 = clazz.getResource("images/photo2.jpg").getPath();
		System.out.println(str2);
		System.out.println(clazz.getName()); // 패키지.클래스이름
		System.out.println(clazz.getSimpleName()); // 클래스이름
		System.out.println(clazz.getPackageName()); // 패키지
		// 2 객체로부터 얻기
		Class clazz2 = Class.forName("chap11.sec01.exam01.Car");
		System.out.println(clazz2.getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println(clazz2.getPackageName());
		// 3 클래스로부터 이미 생성된 객체를 통해 얻기
		Car car = new Car();
		Class clazz3 = car.getClass();
		System.out.println(clazz3.getName());
		System.out.println(clazz3.getSimpleName());
		System.out.println(clazz3.getPackageName());
	}
}