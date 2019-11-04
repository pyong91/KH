package oop.poly2;

public class Cat extends Animal{

	@Override
	public void bark() {
		System.out.println("야옹~");
	}

	@Override
	public void info() {
		System.out.println("고양이입니다");
	}

}
