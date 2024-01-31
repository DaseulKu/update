package chap09.sec02.exam01;

class AnyClass{
	void mmm() {}
}
public class Ex {

	public static void main(String[] args) {
		AnyClass ac = new AnyClass() {
			@Override
			void mmm() {
				super.mmm();
			}	
		};//{};익명자식객체
	}
}