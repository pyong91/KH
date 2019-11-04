package oop.inherit8;

public class Test_inherit8 {
	public static void main(String[] args) {
		MP3 mp3 = new MP3("노래");
		mp3.execute();
		mp3.forward();
		mp3.rewind();
		
		AVI avi = new AVI("영상");
//		avi.execute();
		avi.setSpeed(5);
		avi.forward();
		avi.rewind();
		avi.execute();
		
		PPT ppt = new PPT("피피티");
		ppt.setSize(10);
		ppt.execute();
		ppt.information();
		
	}
}
