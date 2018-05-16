package Q13_Fibonacci;

public class Fibonacci_JeromeAns {
	
	/*
	 * Q 13 - 피보나치 수
	 * 
	 * 피보나치 수는 F(0) = 0, F(1) = 1일 때, 
	 * 2 이상의 n에 대하여 F(n) = F(n-1) + F(n-2)가 적용되는 점화식입니다.
	 * 2 이상의 n이 입력되었을 때, fibonacci 함수를 제작하여 
	 * n번째 피보나치 수를 반환해 주세요.
	 * 
	 * 예를들어 n = 3이라면 2를 반환해주면 됩니다.
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
	
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Fibonacci_JeromeAns c = new Fibonacci_JeromeAns();
		int testCase = 4;
		System.out.println(c.fibonacci(testCase));
	}

}
