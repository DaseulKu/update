package ramda;

public class MyFuncEx {

	public static void main(String[] args) {
		MyFunc mf = () -> {
			System.out.println("ramda");
		};
		mf.aaa();

		MyFunc mf1 = new MyFunc() {
			@Override
			public void aaa() {
				System.out.println("ramda");
			}
		};
		mf1.aaa();
	}
}