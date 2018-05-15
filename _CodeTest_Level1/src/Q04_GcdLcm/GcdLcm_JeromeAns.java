package Q04_GcdLcm;

import java.util.Arrays;

public class GcdLcm_JeromeAns {
	
	/*
	 * Quiz 04 - �ִ������� �ּҰ����
     * 
     * �� ���� �Է¹޾� �� ���� �ִ������� �ּҰ������ ��ȯ���ִ� gcdlcm �Լ��� �ϼ��� ������.
     * �迭�� �� �տ� �ִ�����, �� ���� �ּҰ������ �־� ��ȯ�ϸ� �˴ϴ�.
     * 
     * ������� gcdlcm(3,12)�� �ԷµǸ�, [3, 12]�� ��ȯ���ָ� �˴ϴ�.
	 */
	
	public int[] gcdlcm(int a, int b) {
		int[] answer = new int[2];
		
		int big, small;				// ū��, ������
		int quotient, remainder;	// ��, ������
		int gcm, lcm;				// �ִ�����, �ּҰ����
		
		if(a>=b) {
			big = a; small = b;
		} else {
			big = b; small = a;
		}
		while(true) {
			System.out.println("big : " + big + ", small : " + small);
			quotient = big/small;
			System.out.println("�� : " + quotient);
			remainder = big-quotient*small;	// big % small
			System.out.println("������ : " + remainder);
			
			if(remainder == 0) {
				gcm = small;
				lcm = (a*b)/gcm;
				System.out.println(a + ", " + b + "�� �ִ����� : " + gcm);
				System.out.println(a + ", " + b + "�� �ּҰ���� : " + lcm);
				break;
			}
			big = small;
			small = remainder;
		}
		answer[0] = gcm;
		answer[1] = lcm;
		return answer;
	}// gcdlcm END
	
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		GcdLcm_JeromeAns c = new GcdLcm_JeromeAns();
		
		System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
	}// main END
	
}// class END