package Q04;

import java.util.Scanner;

public class Main {
	
	/*
	 * ������ ���
	 * 
	 * [�ǽ�����]
	 * �������� ����ϴ� ���α׷��� �ۼ��غ�����.
	 * 
	 * [�Է�]
	 * ����ϰ� ���� �������� �ܼ� N(2<=N<=9)�� �Է��մϴ�.
	 * 
	 * [���]
	 * �Է¹��� N���� ������� ���η� ����մϴ�.
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		for(int i=1; i<9; i++) {
			System.out.println(dan*i);
		}
		System.out.print(dan*9);
	}

}