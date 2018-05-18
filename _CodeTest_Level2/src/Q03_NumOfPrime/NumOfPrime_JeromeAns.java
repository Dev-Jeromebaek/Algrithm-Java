package Q03_NumOfPrime;

public class NumOfPrime_JeromeAns {
	
	/*
	 * Q 03 - �Ҽ� ã��
	 * 
	 * numberOfPrime �޼ҵ�� ���� n�� �Ű������� �Է¹޽��ϴ�.
	 * 1���� �Է¹��� ���� n ���̿� �ִ� �Ҽ��� ������ ��ȯ�ϵ���    
	 * numberOfPrime �޼ҵ带 ��������.
	 * �Ҽ��� 1�� �ڱ� �ڽ����θ� ���������� ���� �ǹ��մϴ�.
	 * (1�� �Ҽ��� �ƴմϴ�.)
	 * 10�� �Է¹޾Ҵٸ�, 1���� 10 ������ �Ҽ��� [2, 3, 5, 7] 4���� �����ϹǷ� 4�� ��ȯ
	 * 5�� �Է¹޾Ҵٸ�, 1���� 5������ �Ҽ��� [2. 3. 5] 3���� �����ϹǷ� 3�� ��ȯ.
	 * 
	 */
	
	int numberOfPrime(int n) {
		int result = 0;
		// �Լ��� �ϼ��ϼ���.
		for (int i=2; i<=n; i++) {
			int count = 0;
			for (int j=2; j<=i; j++) {
				if (i%j==0) count++;
			}
			if (count == 1) result++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		NumOfPrime_JeromeAns prime = new NumOfPrime_JeromeAns();
		System.out.println(prime.numberOfPrime(10));
	}

}