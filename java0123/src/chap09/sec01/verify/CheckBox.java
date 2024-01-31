package chap09.sec01.verify;

public class CheckBox { // 05번
	OnSelectListener listener; 
	
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	void select() {
		listener.onSelect();
	}
	static interface OnSelectListener{ 
		void onSelect();
	}
}