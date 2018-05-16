package Q11_WaterMelon;

public class WaterMelon_JeromeAns {
	
	/*
	 * Q 11 - 수박수박수박수박수박수?
	 * 
	 * water_melon함수는 정수 n을 매개변수로 입력받습니다.
	 * 길이가 n이고, 수박수박수...와 같은 패턴을 
	 * 유지하는 문자열을 리턴하도록 함수를 완성하세요.
	 * 
	 * 예를들어 n이 4이면 '수박수박'을 리턴하고 
	 * 3이라면 '수박수'를 리턴하면 됩니다.
	 * 
	 */

	public String watermelon(int n) {
		String result = "";
		for (int i=0; i<n; i++) {
			if (i%2 == 0) {
				result += "수";
			} else {
				result += "박";
			}
		}
		return result;
	}
	
	// 실행을 위한 테스트코드입니다.
	public static void main(String[] args) {
		WaterMelon_JeromeAns wm = new WaterMelon_JeromeAns();
		System.out.println("n이 3인 경우 : " + wm.watermelon(3));
		System.out.println("n이 4인 경우 : " + wm.watermelon(4));
	}
}
