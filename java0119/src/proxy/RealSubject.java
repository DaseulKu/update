package proxy;

public class RealSubject implements ISubject{
	@Override
	public void action() {
		System.out.println("RealService is doing something");		
	}
}