package sec06.verify;
//P269 4번 static 유무에 따른 차이점
class MyClass{
	void method1() { //메인에서 객체 생성 > 힙영역에 존재함, 호출해서 사용, 목적에 따라 여러 개 생성해서 사용 가능
		System.out.println("method1");
	}
	static void method2() { // 메모리에 자신의 영역이 따로 있기 때문에  객체 생성과 상관없이 혼자 그곳을 사용하고 객체처럼 여러 개 만들 수 없고 여러 개 호출해도 다 같은거임 
		System.out.println("method2"); //this.으로 불러서 다른 곳에서 사용 못함
	}
}

public class StaticClass {
	static void method3() {
		System.out.println("method3");
	}

	public static void main(String[] args) {
		MyClass.method2();//1
		MyClass mc = new MyClass();
		mc.method1();//2
		mc.method2();//1
		
		MyClass mc2 = new MyClass();
		mc2.method1();//2 서로 다른 객체
		mc2.method2();//1 다 같은거

	}

}
