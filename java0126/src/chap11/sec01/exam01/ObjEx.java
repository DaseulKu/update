package chap11.sec01.exam01;

public class ObjEx {

	public static void main(String[] args) {
		String str1 = "가나다";
		String str2 = "가나다";
		System.out.println(str1.equals(str2));
		
		String str3 = new String("가나다");
		String str4 = new String("가나다");
		System.out.println(str3.equals(str4));
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		boolean result = obj1.equals(obj2);
		System.out.println(result);
		
		boolean result2 = (obj1==obj2);
		System.out.println(result2);
	}
}