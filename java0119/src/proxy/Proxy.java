package proxy;

public class Proxy implements ISubject{// proxy 는 ISub 인터페이스 구현하며
	private RealSubject realSubject; // 실제동작은 RealSub 객체에 위임 (이게 구현클래스)
	
	public Proxy(RealSubject realSubject) { // Proxy 에서는 action 메소드를
		this.realSubject = realSubject;
	}
	@Override
	public void action() { // 호출하기 전과 후에 로깅을 추가
		System.out.println("Logging before calling action");
		realSubject.action(); //프록시객체 실행
		System.out.println("Logging after calling action");
	}
}