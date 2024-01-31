package chap07.sec02.verify04;

public class Ex05 {
	public static void main(String[] args) {
		Controller controller = new Controller();
		
		controller.setService(new MemberService());
		controller.service.login();
		
		controller.setService(new AService());
		controller.service.login();
	}
}