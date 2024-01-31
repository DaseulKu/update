package chap09.sec02.verify;

public class AnonymousEx {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.start();
		anony.method1();
		anony.method2(new Worker() {
			@Override
			void start() {
				System.out.println("테스트합니다");
			}
		});
	}
}