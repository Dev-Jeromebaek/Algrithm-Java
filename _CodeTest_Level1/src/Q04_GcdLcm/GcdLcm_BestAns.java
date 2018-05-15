package Q04_GcdLcm;

import java.util.Arrays;

public class GcdLcm_BestAns {
	
	/*
	 * Quiz 04 - 최대공약수와 최소공배수
     * 
     * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환해주는 gcdlcm 함수를 완성해 보세요.
     * 배열의 맨 앞에 최대공약수, 그 다음 최소공배수를 넣어 반환하면 됩니다.
     * 
     * 예를들어 gcdlcm(3,12)가 입력되면, [3, 12]를 반환해주면 됩니다.
	 */
	
    public int[] gcdlcm(int a, int b) {
    	int[] answer = new int[2];
    	
        answer[0] = gcd(a,b);
        answer[1] = (a*b)/answer[0];
        
        return answer;
    }

	public static int gcd(int p, int q) {
		if (q == 0) return p;
		return gcd(q, p%q);
	}

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
    	GcdLcm_BestAns c = new GcdLcm_BestAns();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
    }
	
}// class END
