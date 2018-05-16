package Q05_ReverseStr;

import java.util.Arrays;
import java.util.Collections;

public class ReverseStr_JeromeAns {

	/*
	 * Quiz 05 - 문자열 내림차순으로 배치하기
     * 
     * reverseStr 메소드는 String형 변수 str을 매개변수로 입력받습니다.
     * str에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 String을 리턴해주세요.
     * str는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
     * 
     * 예를들어 str이 "Zbcdefg"면 "gfedcbZ"을 리턴하면 됩니다.
	 */
	
	public String reverseStr(String str) {
		
		char[] charArr = str.toCharArray();
		
		for (int i=0; i<str.length(); i++) {
			for (int j=0; j<str.length()-1; j++) {
				if (charArr[j] < charArr[j+1]) {
					char temp = charArr[j];
					charArr[j] = charArr[j+1];
					charArr[j+1] = temp;
				}
			}
		}
		str = "";
		for (int i=0; i<charArr.length; i++) {
			str += charArr[i];
		}
		return str;
		
	}// reverseStr END
	
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		ReverseStr_JeromeAns rs = new ReverseStr_JeromeAns();
		System.out.println(rs.reverseStr("Zbcdefg"));
	}// main END
	
}// class END
