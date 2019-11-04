package oop.inherit8;

public class PPT extends File{
	protected int size = 1;
	
	public PPT(String fileName) {
		super(fileName);
	}
	
	public PPT(String fileName, int fileSize) {
		super(fileName, fileSize);
	}
	
	public PPT(String fileName, int fileSize, int size) {
		super(fileName, fileSize);
		setSize(size);
	}

	@Override
	public void execute() {
		System.out.println("파워포인트 애니메이션을 재생합니다");
	}
	
	public void information() {
		System.out.println("파일이름 : " + super.fileName);
		System.out.println("파일크기 : " + super.fileSize);
		System.out.println("장수 : " + this.size);
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
}
