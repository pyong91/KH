package logic;

public class Test02 {

	public static void main(String[] args) {
//		����
//		������ ����ϴ� ���α׷��� ���弼��
//		����� �ѱ׸��� 5000��, «�� �ѱ׸��� 6000���� �߱����� �ֽ��ϴ�.
//		30000�� �̻� ���Ž� 15% ���� ��縦 �����ϰ� �ִٰ� �� ��,
//		����� 4�׸�, «�� 2�׸��� �ֹ��ϸ� ���� ����� �Ǵ��� ����Ͽ� ����ϼ���
		
		int ja = 4;
		int jaPrice = 5000;
		int jjam = 2;
		int jjamPrice = 6000;
		
		int jaTotal = ja * jaPrice;
		int jjamTotal = jjam * jjamPrice;
		int total = jaTotal + jjamTotal;
		
		boolean result = total >= 30000;
		
		System.out.println(total);
		System.out.println(result);
		
	}

}
