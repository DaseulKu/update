package chap9.sec02.exam03;

public class Anonymous {
	// 필드 초기값으로 대입
	Person field = new Person() {
		void work() {
			System.out.println("출근");
		}
		@Override
		void wake() {
			System.out.println("6시기상");
			work();
		}		
	};
	void method1() {
		// 로컬 변수값으로 대입
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책");
			}
			@Override
			void wake() {
				System.out.println("7시기상");
				walk();
			}			
		};
		localVar.wake(); // 로컬변수사용
	}
	void method2(Person person) { // 매개변수
		person.wake();
	}
}