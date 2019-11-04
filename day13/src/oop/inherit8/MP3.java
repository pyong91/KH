package oop.inherit8;

public class MP3 extends Media{
	protected int duratrion;	
	
	public MP3(String fileName) {
		super(fileName);
	}
	
	public MP3(String fileName, int fileSize) {
		super(fileName, fileSize);
	}
	
	public MP3(String fileName, int fileSize, int duration) {
		super(fileName, fileSize);
		this.setDuratrion(duration);
	}	
	
	@Override
	public void execute() {
		System.out.println("음악을 재생합니다");
	}
	
	public void forward() {
		System.out.println("음악을 빨리감기합니다");
	}
	
	public void rewind() {
		System.out.println("음악을 되감기합니다");
	}
	
	public void setDuratrion(int duratrion) {
		this.duratrion = duratrion;
	}
	
	public int getDuratrion() {
		return duratrion;
	}
}
