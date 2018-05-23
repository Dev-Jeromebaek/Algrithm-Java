package Q04_Caesar;

public class Caesar_JeromeAns {
	
	/*
	 * Q 04 - 시저 암호
	 * 
	 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 
	 * 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
	 * A를 3만큼 밀면 D가 되고 z를 1만큼 밀면 a가 됩니다.
	 * 공백은 수정하지 않습니다.
	 * 
	 * 보낼 문자열 s와 얼마나 밀지 알려주는 n을 입력받아 
	 * 암호문을 만드는 caesar 함수를 완성해 보세요.
	 * 
	 * - "a B z", 4를 입력받았다면 "e F d"를 리턴합니다.
	 */

	String caesar(String s, int n) {
		String result = "";
		// 함수를 완성하세요.
		String[] strArr = s.split("");
		for (String each : strArr) {
			result += changeString(each, n);
		}
		
		return result;
	}
	
	String changeString(String str, int count) {
		int chrNum = str.charAt(0);
//		System.out.println(chrNum);
//		System.out.println("chrNum : " + chrNum);
//		System.out.println(Character.toString((char)chrNum));
		if(chrNum != 32) {
			for (int i=0; i<count; i++) {
				if(chrNum >=97 && chrNum <=122) {
					chrNum++;
					if(chrNum > 122) {
						chrNum = 97;
					}
				} else if (chrNum >=65 && chrNum <= 90) {
					chrNum++;
					if(chrNum > 90) {
						chrNum = 65;
					}
				}
			}
		}
		
		return Character.toString((char)chrNum);
	}
	
	public static void main(String[] args) {
		Caesar_JeromeAns c = new Caesar_JeromeAns();
		System.out.println("s는 'a B z', n은 4인 경우 : " + c.caesar("a B z", 4));
	}
}
