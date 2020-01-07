package home.bean;

public class FilesDto {
	private int files_no;//번호(기본키)
	private int origin;//게시글번호
	private String uploadName;//올린이름
	private String saveName;//실제이름
	private String fileType;//파일유형
	private long fileSize;//파일크기

	public FilesDto() {
		super();
	}

	public int getFiles_no() {
		return files_no;
	}

	public void setFiles_no(int files_no) {
		this.files_no = files_no;
	}

	public int getOrigin() {
		return origin;
	}

	public void setOrigin(int origin) {
		this.origin = origin;
	}

	public String getUploadName() {
		return uploadName;
	}

	public void setUploadName(String uploadName) {
		this.uploadName = uploadName;
	}

	public String getSaveName() {
		return saveName;
	}

	public void setSaveName(String saveName) {
		this.saveName = saveName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

}
