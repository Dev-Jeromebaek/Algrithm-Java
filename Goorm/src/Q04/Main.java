package Q04;

import java.util.Scanner;

public class Main {
	
	/*
	 * 구구단 출력
	 * 
	 * [실습내용]
	 * 구구단을 출력하는 프로그램을 작성해보세요.
	 * 
	 * [입력]
	 * 출력하고 싶은 구구단의 단수 N(2<=N<=9)를 입력합니다.
	 * 
	 * [출력]
	 * 입력받은 N단을 결과값만 세로로 출력합니다.
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		for(int i=1; i<9; i++) {
			System.out.println(dan*i);
		}
		System.out.print(dan*9);
	}

}
