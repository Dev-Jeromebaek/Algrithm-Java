package Q09;

import java.util.Scanner;

public class Main {

	/*
	 * ����� ��
	 * 
	 * [�ǽ�����]
	 * ���(divisor)�� � ���� �������� �� �������� 0�� ���� ���ϸ�,
	 * ��� ����� ���� �ݴ�Ǵ� �����Դϴ�.
	 * 
	 * ���� ���, 12�� ��� ����� ���ϸ� 1, 2, 3, 4, 6, 12 �Դϴ�. 
	 * �Է¹��� ������ ���� ��� ����� ���� ���ϴ� ���α׷��� �ۼ��غ�����.
	 * 
	 * [�Է�]
	 * ���� N(1<= N <= 100000)�� �Է��մϴ�.
	 * 
	 * [���]
	 * �Է¹��� ���� N�� ��� ����� ���� ����մϴ�.
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		int num = scan.nextInt();
		for (int i=1; i<=num/2; i++) {
			if(num%i == 0) result += i;
		}
		System.out.print(result + num);
	}
	
}