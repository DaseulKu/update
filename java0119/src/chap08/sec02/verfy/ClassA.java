package chap08.sec02.verfy; //1번에 2번

interface InterA{
	void method();
}

class ClassB implements InterA{
	@Override
	public void method() {
	}
}
public class ClassA extends ClassB{
	public static void main(String[]args) {
		InterA ita = new ClassA();
	}
}
