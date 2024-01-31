package chap9.sec02.exam05;

public class Button {
	OnClickListner listner;

	void setOnClickListner(OnClickListner listner) {
		this.listner = listner;
	}

	void touch() {
		listner.onClick();
	}

	static interface OnClickListner {
		void onClick();
	}
}
