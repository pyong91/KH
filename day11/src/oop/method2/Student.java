package oop.method2;

public class Student {
	String name;
	int kor;
	int eng;
	int mat;
	int sum;
	double avg;
	
	void set(String name, int kor, int eng, int mat, int sum, double avg) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.sum = sum;
		this.avg = avg;		
	}
	
	void print() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(sum);
		System.out.println(avg);
	}
}
