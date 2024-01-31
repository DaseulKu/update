package chap9.sec02.exam03;

public class AnonymousEx {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.wake();
		
		anony.method1();
		
		anony.method2(new Person() {
			void study() {
				System.out.println("공부");
			}

			@Override
			void wake() {
				System.out.println("8시기상");
				study();
			}		
		});
	}
}