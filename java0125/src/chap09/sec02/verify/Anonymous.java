package chap09.sec02.verify;

public class Anonymous {
	Worker field = new Worker() {

		@Override
		void start() {
			System.out.println("디자인합니다");
		}
	};
	void method1() {Worker localVar = new Worker() {

		@Override
		void start() {
			System.out.println("개발합니다");
		}
		
	};
	localVar.start();
}
	void method2(Worker worker) {
		worker.start();
	}
}