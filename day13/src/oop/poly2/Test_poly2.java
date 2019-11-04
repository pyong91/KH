package oop.poly2;

import java.util.Random;

//	다음 구조를 구현

//	고양이(Cat)
//	 - bark() : 야옹~ 출력
//	 - info() : 고양이입니다 출력

//	강아지(Dog)
//	 - bark() : 멍멍~ 출력
//	 - info() : 강아지입니다 출력

//	사자(Lion)
//	 - bark() : 어흥~ 출력
//	 - info() : 사자입니다 출력

public class Test_poly2 {

	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(3) + 1;
		System.out.println(n);
		Animal animal = new Cat();

		switch (n) {
		case 1:
			animal = new Cat();
			break;
		case 2:
			animal = new Dog();
			break;
		case 3:
			animal = new Lion();
			break;
		}

		n = r.nextInt(2) + 1;

		switch (n) {
		case 1:
			animal.bark();
			break;
		case 2:
			animal.info();
			break;
		}

	}

}
