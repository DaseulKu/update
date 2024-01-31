package chap09.sec02.verify;

public class CheckBox {
	OnSelectListner listner;
	void setOnSelectListner(OnSelectListner listner) {
		this.listner = listner;
	}
	void select() {
		listner.onSelect();
	}
	static interface OnSelectListner {
		void onSelect();
	}
}