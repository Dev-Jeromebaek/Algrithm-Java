package Q02_Divisible;

import java.util.Arrays;

public class Divisible2 {
	
	/*
	 * Quiz 02 - ������ �������� ���� �迭
     * 
     * divisible �޼ҵ�� int�� �迭 array�� int divisor�� �Ű������� �޽��ϴ�.
     * array�� �� element �� divisor�� ������ �������� ���� �����ϴ�
     * ���ο� �迭�� ���� ��ȯ�ϵ��� divisible�� �ڵ带 �ۼ��� ������.
     * 
     * ������� array�� {5, 9, 7, 10} �̰� divisor�� 5 �̸� {5, 10} �� �����ؾ� �մϴ�.
	 */
	
	public int[] divisible(int[] array, int divisor) {
		// ret�� array�� ���Ե� ������, divisor�� ������ �������� ���ڸ� ������� ��������.
		
		int[] ret = new int[/*������ �������� ������ ����*/];
		
		return ret;
	}// divisible END
	
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	
	public static void main(String[] args) {
		Divisible2 div = new Divisible2();
		int[] array = {5, 9, 7, 10};
		System.out.println(Arrays.toString(div.divisible(array, 5)));
	}// main END
	
}// class END