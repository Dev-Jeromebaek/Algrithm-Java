package Lesson03_TimeComplexity;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class L31_Frogjmp_JeromeAns {
	
	public int solution(int X, int Y, int D) {
		// write your code in Java SE 8
		int count = 0;
		while(X < Y) {
			X += D;
			count++;
		}
		return count;
	}
	
	// TestCase Method
	public static void main(String[] args) {
		L31_Frogjmp_JeromeAns test = new L31_Frogjmp_JeromeAns();
		int X, Y, D;
		X = 1; Y = 5; D = 2;
		System.out.println(test.solution(X, Y, D));
	}
	
	// �� ���� �׽�Ʈ�� �̷��� ũ���ϳ�..;
	// x=3; y=999111321, d=7 ??????������ �峭�ϳ� �̷����� �ð������ɸ��ٰ�?
	// 55%;

}