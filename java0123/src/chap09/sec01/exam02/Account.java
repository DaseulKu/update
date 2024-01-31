package chap09.sec01.exam02;



public class Account { // 바깥클래스에서 내부클래스
	Name name = new Name();
	static School school = new School();
	
	class Name{}
	static class School{}
}
