package Q06;

import java.util.Scanner;

public class Main {
	
	/*
	 * �κ� ���ڿ�
	 * 
	 * [�ǽ�����]
	 * ���ڿ��� �Է¹����� �Ʒ��� ���� ���� �κ� ���ڿ��� ��� ����ϴ� ���α׷��� �ۼ��Ͻʽÿ�.
	 * ���� ��� ACE�� �ԷµǸ�
	 * A
	 * AC
	 * ACE
	 * �� ��µǵ��� �ϸ� �˴ϴ�.
	 * 
	 * [�Է�]
	 * ������ ���ڿ� (�ִ� 100��)
	 * 
	 * [���]
	 * ���� ���� �κ� ���ڿ� ���
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String param = scan.nextLine();
		String[] strArr = param.split("");
		for (int i=0; i<param.length(); i++) {
			String result = "";
			for (int j=0; j<=i; j++) {
				result += strArr[j];
			}
			System.out.println(result);
		}
	}
}