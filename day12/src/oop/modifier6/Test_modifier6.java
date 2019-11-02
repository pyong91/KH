package oop.modifier6;

public class Test_modifier6 {
//	이름 		국어점수	 영어점수 	수학점수	 총점	 평균	합격/불합격
//	david	80		70		85		-	-		-
//	ronaldo	91		53		77		-	-		-
//	messi	66		89		75		-	-		-

//	 - 점수는 0 ~ 100점 사이만 설정 가능
//	 - 총점과 평균은 자동으로 계산
//	 - 평균이 60점 미만이면 불합격, 60점 이상이면 합격으로 출력 시 표시

	public static void main(String[] args) {
		User user1 = new User("david", 80, 70, 85);
		User user2 = new User("ronaldo", 91, 53, 77);
		User user3 = new User("messi", 66, 89, 75);
			
		user1.print();
		user2.print();
		user3.print();
	}

}
