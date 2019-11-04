package oop.inherit4;

//## oop.inherit4
//
//다음 내용을 수행할 수 있는 클래스 구조를 구현하고 객체 생성 및 기능을 실행하시오.
//
//### 갤럭시 s10(GalaxyS10)
//
//저장할 데이터
//
//- 전화번호(number) 
//- 메모리 용량(memory) : 128, 256, 512GB 중에서만 설정 가능
//
//필요한 기능
//
//- 전화걸기(call) : 화면에 "전화를 걸고 있습니다" 출력
//- 문자보내기(sms) : 화면에 "문자메시지를 전송합니다" 출력
//- 사진찍기(photo) : 화면에 "사진 촬영을 시작합니다" 출력
//
//### 갤럭시 노트 10(GalaxyNote10)
//
//저장할 데이터 : 갤럭시s10과 동일
//
//필요한 기능
//
//- 전화걸기(call) : 화면에 "전화를 걸고 있습니다" 출력
//- 문자보내기(sms) : 화면에 "문자메시지를 전송합니다" 출력
//- 사진찍기(photo) : 화면에 "사진 촬영을 시작합니다" 출력
//- 필기(memo) : 화면에 "필기를 시작합니다" 출력
public class Test_inherit4 {

	public static void main(String[] args) {
		GalaxyS10 s10 = new GalaxyS10("010-0000-0000", 128);
		s10.call();
		s10.sms();
		s10.photo();
		
		GalaxyNote10 note10 = new GalaxyNote10("010-0000-1111", 256);
		note10.call();
		note10.sms();
		note10.photo();
		note10.memo();
		
		System.out.println(s10.getMemory());
		System.out.println(note10.getMemory());
	}

}
