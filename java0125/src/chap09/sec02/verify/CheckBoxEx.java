package chap09.sec02.verify;

public class CheckBoxEx {

	public static void main(String[] args) {
		CheckBox cb = new CheckBox();
		cb.setOnSelectListner(new CheckBox.OnSelectListner() {		
			@Override
			public void onSelect() {
				System.out.println("배경을 변경합니다");			
			}
		});	
		cb.select();
	}
}