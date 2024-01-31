package proxy;

public class Client {

	public static void main(String[] args) {
//		ISubject sub1 = new RealSubject(); 외부
//		sub1.action();
		
		ISubject sub = new Proxy(new RealSubject());//내부
		sub.action();
	}
}