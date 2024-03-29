package Q09;

import java.util.Scanner;

public class Main {

	/*
	 * 약수의 합
	 * 
	 * [실습내용]
	 * 약수(divisor)란 어떤 수를 나누었을 때 나머지가 0인 수를 말하며,
	 * 배수 관계와 서로 반대되는 개념입니다.
	 * 
	 * 예를 들어, 12의 모든 약수를 구하면 1, 2, 3, 4, 6, 12 입니다. 
	 * 입력받은 정수에 대한 모든 약수의 합을 구하는 프로그램을 작성해보세요.
	 * 
	 * [입력]
	 * 정수 N(1<= N <= 100000)를 입력합니다.
	 * 
	 * [출력]
	 * 입력받은 정수 N의 모든 약수의 합을 출력합니다.
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		int num = scan.nextInt();
		for (int i=1; i<=num/2; i++) {
			if(num%i == 0) result += i;
		}
		System.out.print(result + num);
	}
	
}
