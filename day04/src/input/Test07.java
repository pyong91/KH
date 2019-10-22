package input;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
//		사용자에게 "진입시간"과 "진출시간"을 입력받아 주차요금을 계산하도록 구현
//		- 주차요금은 10분당 500원(9분까지는 무료)
//		- 시간은 "?시 ?분"의 형태이며 2개의 숫자를 입력받아서 구현
//		- 입력 예 : 1710, 2030
		
		Scanner sc = new Scanner(System.in);
		int in, out;
		int inTime, outTime, total, res;
		int price = 500;
		
//		입력
		in = sc.nextInt();
		out = sc.nextInt();
		sc.close();
		
//		계산
		inTime = in / 100 * 60 + in % 100;
		outTime = out / 100 * 60 + out % 100;
		total = outTime - inTime;
		res = total / 10 * price;
		
//		출력
		System.out.println("이용시간 : " + total + "분");
		System.out.println("이용요금 : " + res + "원");
	}

}