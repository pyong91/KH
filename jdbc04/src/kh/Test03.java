package kh;

import java.util.List;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		KHMemberDao dao = new KHMemberDao();
		
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		
		List<KHMemberDto> list = dao.search(name);
		
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
	}
}
