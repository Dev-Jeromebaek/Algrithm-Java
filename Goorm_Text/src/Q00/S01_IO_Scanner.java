package Q00;

import java.util.Scanner;

public class S01_IO_Scanner {

	// ��ĳ�� ����
	public static final Scanner scanner = new Scanner(System.in);	// ���� �Է��� ���ڷ� Scanner ����
	
	public static void main(String[] args) {
		
		String message = null;
		System.out.println("�޽����� �Է��ϼ���.");
		
		message = scanner.nextLine();	// Ű���� ���� �Է�
		
		System.out.println("�Է� �޽��� : \"" + message + "\"");		// �Է� ���� ���
		
		/******************************************************************/
		
		int kilometer;
		double liter, mpg;
		
		System.out.println("�Ÿ�(km) �� ������ �Է��ϼ��� : ");
		kilometer = scanner.nextInt();	// Ű���� ���� ���� �Է�
		
		System.out.println("���� ���� �Է��ϼ��� : ");
		
		liter = scanner.nextDouble();	// Ű���� ���� Double�� �Է�
		
		mpg = kilometer / liter;		// �Է¹��� kilometer�� liter ���
		
		System.out.println("Kilometer per liter : " + mpg);
		
	}
}