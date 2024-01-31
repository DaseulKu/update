package com.project1;
//p556 ArrayList & list collection
import java.util.ArrayList;
import java.util.List;

class Student{
	String name;
	int kor;
	public Student(String name, int kor) {
		this.kor = kor;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + "]";
	}	
	
}

public class ArrayListEx {

	public static void main(String[] args) {
		String[] strArr = new String[100]; // 고정형배열, 속도빠름
		ArrayList<Student> slist = new ArrayList<Student>();
		slist.add(new Student("홍길동",90));
		slist.add(new Student("홍길철",84));
		slist.add(new Student("홍길순",97));
		for (Student student : slist) {
			System.out.println(student);
		}
		
		
		
		ArrayList<String> alist = new ArrayList<String>();
// 어레이리스트 : 문자열을 가변적으로 배열로 만듦, 고정형에 비해 속도 느림

		List<String> list = new ArrayList<>(); // 축약형
		list.add("홍길동"); //list 컬렉션에 객체 추가하는 메소드
		list.add("김하나");
		list.add("강하나");
		for (String str : list) {
			System.out.println(str);
		}
		list.set(1, "박하나");
		for (String str : list) {
			System.out.println(str);
		}

	}
}
