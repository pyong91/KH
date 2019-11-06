package api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test02 {

	public static void main(String[] args) {
//		테스트 결과
//		 - 예외는 총 2종류가 발생
//		 - ArithmeticException
//		 - InputMismatchException
		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("사과 개수와 인원수를 입력");

		int apple = sc.nextInt();
		int people = sc.nextInt();
		sc.close();

		System.out.println("한 사람당 " + apple / people + "개씩 줄 수 있습니다");
		System.out.println("남은 개수는 " + apple % people + "개 입니다");
		}
		catch (Exception e){
//			System.out.println(e.getMessage());
//			System.err.println(e.getClass());
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "오류가 발생했습니다");
			
		}
//		catch (InputMismatchException e){
//			System.err.println("정수입력해라");
//		}
		
	}

}
