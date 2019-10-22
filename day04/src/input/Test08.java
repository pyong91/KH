package input;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
//		일반적으로 BMI 지수를 이용하여 비만도를 측정할 때에는
//		비만인지 아닌지 판단하는 기준값으로 BMI = 24.5 를 사용합니다.
//		즉, BMI가 24.5 이상이면 비만으로 보고, 미만이면 정상 또는 저체중이라고 봅니다.
//		또한 BMI가 18.5 미만이면 저체중으로 본다고 할 때
//		사용자에게 키와 체중을 입력받아 BMI 지수를 계산하여 "정상"인지 판단후 출력
//		비만도 체중(kg)/키(m)*키(m)
		
//		입력
		Scanner sc = new Scanner(System.in);
		boolean res;
		double bmi;
		System.out.println("키입력(m)");
		double h = sc.nextDouble();
		System.out.println("몸무게(kg)입력");
		double k = sc.nextDouble();
		
		sc.close();
		
//		계산
		bmi = k / (h * h);
		
		res = bmi > 18.5 && bmi < 24.5;
		
//		출력
		System.out.println("BMI : " + bmi);
		System.out.println("정상 : " + res);
		
	}
}
