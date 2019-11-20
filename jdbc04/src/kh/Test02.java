package kh;

import java.util.List;

//	화면에 kh_member 테이블의 데이터 개수와 목록을 출력
public class Test02 {
	public static void main(String[] args) throws Exception {
		KHMemberDao dao = new KHMemberDao();
		List<KHMemberDto> list = dao.getKHMember();
		
		for(KHMemberDto member : list) {
			System.out.print(member.getNumber()+ "\t");
			System.out.print(member.getName()+ "\t");
			System.out.print(member.getId()+ "\t");
			if(member.getId().length()<8) System.out.print("\t");
			System.out.print(member.getPw()+ "\t");
			if(member.getPw().length()<8) System.out.print("\t");
			System.out.print(member.getPoint()+ "\t");
			System.out.println(member.getJoinDate().substring(0, 10));
		}
		System.out.println("총 멤버 수 : " + list.size());
	}
}