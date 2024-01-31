package chap09.sec02.verify;

public class AnonyEx {

	public static void main(String[] args) {
		Anony anony = new Anony();
		anony.field.run();
		anony.method1();
		anony.method2(new Vehicle() {

			@Override
			public void run() {
				System.out.println("트럭이 달립니다");
			}
		});
	}
}