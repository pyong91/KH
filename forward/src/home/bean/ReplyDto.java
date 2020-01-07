package home.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReplyDto {

	private int reply_no;
	private String content;
	private String wdate;
	private String writer;
	private int origin;

	public ReplyDto() {
		super();
	}

	public ReplyDto(int reply_no, String content, String wdate, String writer, int origin) {
		super();
		this.reply_no = reply_no;
		this.content = content;
		this.wdate = wdate;
		this.writer = writer;
		this.origin = origin;
	}

	public int getReply_no() {
		return reply_no;
	}

	public void setReply_no(int reply_no) {
		this.reply_no = reply_no;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getOrigin() {
		return origin;
	}

	public void setOrigin(int origin) {
		this.origin = origin;
	}

	public String getWdateWithFormat() throws ParseException {
		if (wdate != null) {
			SimpleDateFormat read = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
			Date date = read.parse(wdate);
			SimpleDateFormat write = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String time = write.format(date);
			return time;
		} else
			return "";
	}
}
