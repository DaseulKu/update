package sec06.exam005;

public class ClassName {
	//인스턴스 필드와 메소드
	int field1;
	void method1() {}
	//정적 필드와 메소드
	static int field2; // 사용 가능
	static void method2() {}// 사용 가능
	//정적 메소드
	static void method3() {// 사용 가능
//		field1 = 10; 즉시 사용 불가능 > 객체 생성 후 사용 가능
		
		ClassName cn = new ClassName();
		cn.field1 = 10;

		field2 = 10; // 사용 가능
	}
	
	void method4(){
		this.field1 = 10;
		ClassName.field2 = 10;
	}
}
