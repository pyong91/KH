package oop.inherit8;

public class AVI extends Media{

	protected int speed = 1;
	
	public AVI(String fileName) {
		super(fileName);
	}
	
	public AVI(String fileName, int fileSize) {
		super(fileName, fileSize);
	}
	
	public AVI(String fileName, int fileSize, int speed) {
		super(fileName, fileSize);
		setSpeed(speed);
	}

	@Override
	public void execute() {
		System.out.println("영상 재생을 " + this.speed + "배속으로 시작합니다");
	}
	
	public void forward() {
		System.out.println("영상을 빨리감기합니다");
	}
	
	public void rewind() {
		System.out.println("영상을 되감기합니다");
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
}
