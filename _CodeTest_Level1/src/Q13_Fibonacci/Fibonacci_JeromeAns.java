package Q13_Fibonacci;

public class Fibonacci_JeromeAns {
	
	/*
	 * Q 13 - �Ǻ���ġ ��
	 * 
	 * �Ǻ���ġ ���� F(0) = 0, F(1) = 1�� ��, 
	 * 2 �̻��� n�� ���Ͽ� F(n) = F(n-1) + F(n-2)�� ����Ǵ� ��ȭ���Դϴ�.
	 * 2 �̻��� n�� �ԷµǾ��� ��, fibonacci �Լ��� �����Ͽ� 
	 * n��° �Ǻ���ġ ���� ��ȯ�� �ּ���.
	 * 
	 * ������� n = 3�̶�� 2�� ��ȯ���ָ� �˴ϴ�.
	 * 
	 */
	
	public long fibonacci(int num) {
		long answer = 0;
		long a = 0;
		long b = 1;
		for(int i=0; i<num; i++) {
			if(i != 0) {
				answer = a + b;
				a = b;
				b = answer;
			}
		}
		return answer;
	}
	
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Fibonacci_JeromeAns c = new Fibonacci_JeromeAns();
		int testCase = 4;
		System.out.println(c.fibonacci(testCase));
	}

}