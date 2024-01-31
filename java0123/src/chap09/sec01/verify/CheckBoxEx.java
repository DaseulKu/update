package chap09.sec01.verify;

public class CheckBoxEx {// 05번

	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(new BackgroundChangeListener());
		checkBox.select();
	}
}