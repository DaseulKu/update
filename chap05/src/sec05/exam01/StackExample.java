package sec05.exam01;

public class StackExample {

	public static void main(String[] args) {
//		int age = 32;
//		String name = "강하나";
//		
//		int[]intArray = null;
//		intArray[0] = 10;
		
//		String str = null;
//		System.out.println(str.length());
		
		String name1 = "신용권";//리터럴로 생성
		String name2 = "신용권";
		System.out.println(name1 == name2);//true
		System.out.println(name1.equals(name2));//true
		
		String name3 = new String ("신용권");//new 연산자로 생성
		String name4 = new String ("신용권");
		System.out.println(name3 == name4);//false
		System.out.println(name3.equals(name4));//true
	}

}
