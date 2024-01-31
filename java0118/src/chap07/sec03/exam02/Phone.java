package chap07.sec03.exam02;

public abstract class Phone {
	int x;

	public Phone(int x) {
		super();
		this.x = x;
	}
	public abstract String ring(int tel);
}
