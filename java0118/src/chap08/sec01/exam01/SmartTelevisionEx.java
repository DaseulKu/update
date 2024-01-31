package chap08.sec01.exam01;

public class SmartTelevisionEx {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		RemoteControl rc = tv;
		Searchable searchable = tv;
	}
}