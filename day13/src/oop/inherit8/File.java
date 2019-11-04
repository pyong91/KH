package oop.inherit8;

public abstract class File {
	protected String fileName;
	protected int fileSize;
	
	public File (String fileName) {
		this(fileName, 0);
	}
	
	public File (String fileName, int fileSize) {
		this.fileName = fileName;
		this.fileSize = fileSize;
	}
	
	public abstract void execute();
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getFileSize() {
		return fileSize;
	}

	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}

	
	
}
