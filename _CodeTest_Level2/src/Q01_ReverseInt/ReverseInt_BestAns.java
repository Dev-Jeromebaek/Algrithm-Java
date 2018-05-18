package Q01_ReverseInt;

public class ReverseInt_BestAns {
	
	/*
	 * Q 01 - 정수 내림차순으로 배치하기
	 * 
	 * reverseInt 메소드는 int형 n을 매개변수로 입력받습니다.
	 * n에 나타나는 숫자를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
	 * 
	 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
	 * n은 양의 정수입니다.
	 * 
	 */
	String res = "";
	public int reverseInt(int n) {
		res = "";
        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
        return Integer.parseInt(res);
	}
	
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		ReverseInt_BestAns ri = new ReverseInt_BestAns();
		System.out.println(ri.reverseInt(118372));
	}

}
