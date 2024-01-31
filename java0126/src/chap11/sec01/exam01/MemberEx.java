package chap11.sec01.exam01;

public class MemberEx {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("BLUE");
		Member obj3 = new Member("red");
		
		System.out.println(obj1);
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1 과 obj2는 동등합니다");
		}else {
			System.out.println("obj1 과 obj2는 동등하지 않습니다");
		}
		if(obj1.equals(obj3)) {
			System.out.println("obj1 과 obj3는 동등합니다");
		}else {
			System.out.println("obj1 과 obj3는 동등하지 않습니다");
		}
	}
}