package oop.method3;

public class Item {
	String name;
	int price;
	String type;
	boolean event;
	
	void set(String name, int price, String type, boolean event) {
		this.name = name;
		this.price = price;
		this.type = type;
		this.event = event;
	}
	
	void print() {
		if(event) {
			System.out.println(name + ", " +"가격: " + price * 90 / 100 + ", " + type + ", 행사적용");
		} else {
			System.out.println(name + ", " +"가격: " + price + ", " + type + ", 행사미적용");
		}
	}
	
	
	
	
	
}