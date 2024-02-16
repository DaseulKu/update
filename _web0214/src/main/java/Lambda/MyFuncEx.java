package Lambda;

public class MyFuncEx {

	public static void main(String[] args) {
		MyFunc mf, mf2, mf3;

		mf = new MyFunc() {
			@Override
			public void method(int x) {
				System.out.println(x);
			}
		};
		mf.method(10);

		mf2 = (a) -> {System.out.println(a);};
		mf2.method(20);

		mf3 = b -> System.out.println(b);
		mf3.method(30);

	}
}