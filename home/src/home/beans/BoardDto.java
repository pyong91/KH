package home.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BoardDto {
	private int no;
	private String head;
	private String title;
	private int replyCount;
	private String writer;
	private String wdate;
	private int readCount;
	private String content;
	
	
	@Override
	public String toString() {
		return "BoardDto [no=" + no + ", head=" + head + ", title=" + title + ", replycount=" + replyCount + ", writer="
				+ writer + ", wdate=" + wdate + ", readcount=" + readCount + ", content=" + content + "]";
	}
	public BoardDto() {
		super();
	}
	public BoardDto(int no, String head, String title, int replycount, String writer, String wdate, int readcount,
			String content) {
		super();
		this.no = no;
		this.head = head;
		this.title = title;
		this.replyCount = replycount;
		this.writer = writer;
		this.wdate = wdate;
		this.readCount = readcount;
		this.content = content;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(int replycount) {
		this.replyCount = replycount;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readcount) {
		this.readCount = readcount;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getWdateWithFormat() throws Exception{
		if(wdate!=null) {
			SimpleDateFormat read = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
			Date date = read.parse(wdate);
			SimpleDateFormat write = new SimpleDateFormat("yyyy-MM-dd");
			String time = write.format(date);
			return time;
		} 
		else return "";
	}
}
