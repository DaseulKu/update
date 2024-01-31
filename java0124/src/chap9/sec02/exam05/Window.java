package chap9.sec02.exam05;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	Button.OnClickListner listner = new Button.OnClickListner() {	
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다");
		}
	};
	Window(){
		button1.setOnClickListner(listner);
		button2.setOnClickListner(new Button.OnClickListner() {			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다");			
			}
		});
	}
}