package Q07;

import java.util.Scanner;

public class Main {

	/*
	 * ��հ� ��պ��� ū ��
	 * 
	 * [�ǽ�����]
	 * ��հ� ��պ��� ū ���� ������ ���ϴ� �����Դϴ�.
	 * 
	 * [�Է�]
	 * ù° �ٿ� ���� ������ ���� (n)�� �Է��մϴ�.
	 * �Ѥ� �ٿ� �������� �����Ͽ� ���� �ϳ��� �Է��մϴ�.
	 * 
	 * [���]
	 * ���(�Ҽ��� ù���� �ڸ�����)�� ����ϰ� �������� �����Ͽ� 
	 * ��պ��� ū ���� ������ ����մϴ�.
	 * 
	 */
	
	String calAvg(int n, String s) {
		double avg = 0.0;
		int larger = 0;
		int temp = 0;
		String[] strArr = s.split("\\s+");
		for(String each : strArr) {
			temp += Integer.parseInt(each);
		}
		avg = temp / (double)n;
		
		for(String each : strArr) {
			if(Double.parseDouble(each) > avg) larger++;
		}
		
		return avg + " " + larger;
	}
	
	public static void main(String[] args) {
		Main test = new Main();
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		scan.nextLine();
		String str = scan.nextLine();
		System.out.println(test.calAvg(count, str));
	}
	
}