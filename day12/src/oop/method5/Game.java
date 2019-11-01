package oop.method5;

public class Game {
	String name;
	int price;
	int sum;
	
	void set(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void play() {
		this.sum += this.price;
	}
	
	void play(int count) {
		this.sum = count * this.price;
	}
	
	void print() {
		System.out.println("게임이름 : " + this.name);
		System.out.println("한판가격 : " + this.price + "원");
		System.out.println("누적수입 : " + this.sum + "원");
	}
}
