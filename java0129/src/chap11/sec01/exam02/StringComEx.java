package chap11.sec01.exam02;

public class StringComEx {

	public static void main(String[] args) {
		String str1 = "aBc";
		String str2 = "Abc";		
		System.out.println(str1.equals(str2));	
		//알파벳대소문자바꾸기
		System.out.println(str1.toLowerCase());
		System.out.println(str2.toUpperCase());		
		System.out.println(str1.equalsIgnoreCase(str2));	
	}
}