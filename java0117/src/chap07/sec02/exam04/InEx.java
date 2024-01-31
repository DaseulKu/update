package chap07.sec02.exam04;

public class InEx {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("변환가능");
		}else {
			System.out.println("변환불가");
		}
	}
	public static void method2(Parent parent) {
			Child child = (Child)parent;		
			System.out.println("변환가능");
		
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
	}
}