package Q03_StrToInt;


public class StrToInt_BestAns {
	
	/*
	 * Quiz 03 - 스트링을 숫자로 바꾸기
     * 
     * strToInt 메소드는 String형 str을 매개변수로 받습니다.
     * str을 숫자로 변환한 결과를 반환하도록 strToInt를 완성하세요.
     * 
     * 예를들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다.
     * str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.
	 */
	
	public int getStrToInt(String str) {
		boolean Sign = true;
		int result = 0;
		
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println("ch : " + ch);
			if (ch=='-') Sign = false;
			else if (ch == '+') continue;
			else result = result * 10 + (ch - '0');
		}
		System.out.println(result);
		return Sign ? 1 : -1 * result;
	}
	
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	
	 public static void main(String[] args) {
		StrToInt_BestAns strToInt = new StrToInt_BestAns();
		
		System.out.println(strToInt.getStrToInt("-1234"));
	}
}
