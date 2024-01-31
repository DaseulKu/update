package chap10.sec01.exam01;

public class AIOOBEtrycatchEx {

	public static void main(String[] args) {
		try {
			String str = args[0];
			String str1 = args[1];
			System.out.println(str);
			System.out.println(str1);
			
		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
//			System.out.println("예외발생");
		}
	}
}