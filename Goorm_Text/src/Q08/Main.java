package Q08;

import java.util.Scanner;

public class Main {

	/*
	 * ���� / ��� ����
	 * 
	 * [�ǽ�����]
	 * ���� ������ �����ϴ� ������ ���̰� ��� ������ ������ ���ϰ�, 
	 * ��� ������ �����ϴ� ������ ������ �� ������ �����Դϴ�.
	 * 
	 * �Է����� 4���� ���ڸ� ���� �Ǵ� ��� ������ �ǵ��� �Է��ϰ�
	 * 5��°�� ��Ÿ�� ���ڸ� ����ϴ� ���� �����Դϴ�.
	 * 
	 * [�Է�]
	 * ���� �Ǵ� ��� ������ 4���� �� (�������� ����)
	 * 
	 * [���]
	 * �Էµ� ���� �Ǵ� ��� �������� 5������ ��Ÿ�� ����
	 * 
	 */
	public static void main(String[] args) {
		  
		// ���ڸ� ������ �迭
		int sequence[] = new int[5];
		Scanner sc = new Scanner(System.in);
		  
		// ����(space bar)�� �������� �� ���� �Է�
		for(int i=0; i<sequence.length; i++)
			sequence[i] = sc.nextInt();
		asdasd
		  /*
		// ���������� ���������� �Ǵ��� ������ ����
		boolean arithmetic = true;
		boolean geometric = true;
		  
		// ���������� ������ ������ �迭
		int sequenceTemp[] = new int[4];

		// ������ ���� ����
		for(int i=0; i<sequenceTemp.length; i++)
		{
			sequenceTemp[i] = sequence[i]-sequence[i+1];
		}
		  
		// ���������� �Ǵ��� ������ ����
		boolean difference = true;
		  
		// �迭�� ó������ ������ �ݺ�(�������� Ȯ��)
		for(int i=0; i<sequence.length-2; i++)
		{
			// ������������ �����ϸ� ���������� true, �ϳ��� �������� ������ false ��, break 
			if(sequence[i]-sequence[i+1] == sequence[i+1]-sequence[i+2])
				arithmetic = true;
			else
			{
				arithmetic = false;
				break;
			}
		}

		// �迭�� ó������ ������ �ݺ�(������ Ȯ��)
		for(int i=0; i<sequence.length-2; i++)
		{
			// ���������� �����ϸ� ���������� true, �ϳ��� �������� ������ false ��, break   
			if(sequence[i+1]/sequence[i] == sequence[i+2]/sequence[i+1])
				geometric = true;
			else
			{
				geometric = false;
				break;
			}
		}
		  
		// ���� ������ ������ ����ִ� �迭�� ó������ ������ �ݺ�
		for(int i=0; i<sequenceTemp.length-2; i++)
		{
			// ������������ �����ϸ� ���������� true, �ϳ��� �������� ������ false ��, break 
			if(sequenceTemp[i]-sequenceTemp[i+1] == sequenceTemp[i+1]-sequenceTemp[i+2])
				difference = true;
			else
			{
				difference = false;
				break;
			}
		}
		  
		// ���� ���� �Բ� ���
		if(arithmetic)
			System.out.println("���� �� : "+(sequence[4]-(sequence[0]-sequence[1]))+", �����߿�");
		if(geometric)
			System.out.println("���� �� : "+(sequence[4]*(sequence[0]/sequence[1]))+", ������");
		if(difference)
			System.out.println("���� �� : "+(sequence[4]-(sequenceTemp[3]-(sequenceTemp[0]-sequenceTemp[1])))+", ��������");
		if(arithmetic=geometric=difference=false)
			System.out.println("����, ���, ���� ���� �ƴ�");
			*/
	}
}