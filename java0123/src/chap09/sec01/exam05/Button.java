package chap09.sec01.exam05;

public class Button {
	OnClickListener listener; // interface type 으로 선언해서 자동타입변환 가능캐함
	
	void setOnClickListener(OnClickListener listener) { // setter 역할이면서 interface 를 매개변수로 사용해서 다형성
		this.listener = listener;
	}
	void touch() {
		listener.onClick();
	}
	static interface OnClickListener{ // 클래스 멤버로 선언된 인터페이스 
		void onClick();
	}
}
