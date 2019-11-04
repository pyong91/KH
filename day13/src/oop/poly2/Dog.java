package oop.poly2;

public class Dog extends Animal{

	@Override
	public void bark() {
		System.out.println("멍멍~");
	}

	@Override
	public void info() {
		System.out.println("강아지입니다");
	}

}
