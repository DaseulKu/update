package sec02.exam01;

public class VariableScopeExample2 {

	public static void main(String[] args) {
		int var1 = 10;
		{
			int var2 = 200;
			System.out.printf("var1: %d, var2: %d\n", var1, var2);
		}
//	System.out.println("var1: %d, var2: %d\n", var1, var2);
		int var3 = 300;
		System.out.printf("var1: %d, var3: %d\n", var1, var3);
		System.out.printf("var1: %d, var3: %d\n", var1, var3);
	}

}
