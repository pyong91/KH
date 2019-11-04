package oop.inherit8;

public abstract class Media extends File{

	public Media(String fileName) {
		super(fileName);
	}
	
	public Media(String fileName, int fileSize) {
		super(fileName, fileSize);
	}
	
	public abstract void forward();
	public abstract void rewind();
	
	
}
