package oop.method1;

public class Test01 {

	public static void main(String[] args) {
//		메세지 4개 생성 및 정보 설정 후 출력
		
//		생성
		Message a = new Message();
		Message b = new Message();
		Message c = new Message();
		Message d = new Message();
		
//		초기화
//		a.name = "담임쌤";
//		a.content = "민지야....";
//		a.time = "오후 4:16";
//		a.remain = 0;
		a.set("담임쌤", "민지야....", "오후 4:16", 0);
		
//		b.name = null;
//		b.content = "네 알겠습니다 선생님";
//		b.time = "오후 4:16";
//		b.remain = 0;
		b.set(null, "네 알겠습니다 선생님", "오후 4:16", 0);
		
//		c.name = "담임쌤";
//		c.content = "지금 수업시간 아니냐?";
//		c.time = "오후 4:17";
//		c.remain = 1;
		c.set("담임쌤", "지금 수업시간 아니냐?", "오후 4:17", 1);
		
//		d.name = "담임쌤";
//		d.content = "너도 함께 교무실로 와라";
//		d.time = "오후 4:17";
//		d.remain = 1;
		d.set("담임쌤", "너도 함께 교무실로 와라", "오후 4:17", 1);
		
//		출력
		a.print();
		b.print();
		c.print();
		d.print();
	}

}
