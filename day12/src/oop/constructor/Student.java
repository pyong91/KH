package oop.constructor;

public class Student {
	private String name;
	private int score;
	
	Student(String name){
		this(name,0);
	}
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	void print() {
		System.out.println(this.name);
		System.out.println(this.score);
	}
}
