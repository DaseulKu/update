package chap07.sec03.exam01;

public class AniEx {

	public static void main(String[] args) {
//		Animal animal = new Animal(); 추상클래스는 객체 생성 불가
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("----------");
		//자동타입변환
		Animal animal = null;
		//자동타입 및 재정의된 메소드 호출
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("----------");
		//메소드의 다형성
		animalSound(new Dog()); // (new Dog())
		animalSound(new Cat()); //(new Cat())자동타입변환되서
	}
	public static void animalSound(Animal animal) {//여기로
		animal.sound();//재정의된 메소드 호출
	}
}