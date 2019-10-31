package oop.test3;

public class Test03 {

	public static void main(String[] args) {
//		메세지 4개 생성 및 정보 설정 후 출력
		Message msg1 = new Message();
		Message msg2 = new Message();
		Message msg3 = new Message();
		Message msg4 = new Message();
		
		msg1.name = "장영철";
		msg1.text = "스마트폰 구입을 축하하노라";
		msg1.time = "오후 7:29";
		msg1.remain = 0;

		msg2.name = "나";
		msg2.text = "앜 영철앜ㅋㅋㅋㅋ";
		msg2.time = "오후 7:32";
		msg2.remain = 0;
		
		msg3.name = "나";
		msg3.text = "졸라 오랜만이다";
		msg3.time = "오후 7:32";
		msg3.remain = 0;
		
		msg4.name = "장영철";
		msg4.text = "작은아버지다";
		msg4.time = "오후 7:32";
		msg4.remain = 0;
		
		System.out.println(msg1.name + "\t: " + msg1.text + "\t" + msg1.time + " " + msg1.remain);
		System.out.println(msg2.name + "\t: " + msg2.text + "\t" + msg2.time + " " + msg2.remain);
		System.out.println(msg3.name + "\t: " + msg3.text + "\t" + msg3.time + " " + msg3.remain);
		System.out.println(msg4.name + "\t: " + msg4.text + "\t" + msg4.time + " " + msg4.remain);
	}

}
