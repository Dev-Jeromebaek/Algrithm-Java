package Q11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// �Է�
		Scanner scan = new Scanner(System.in);
		int[] intArr = new int[2];
		for (int i=0; i<intArr.length; i++) {
			intArr[i] = scan.nextInt();
		}
		// ����
		int pizza = intArr[0];
		int coupon = intArr[1];
		int additionalOrder = pizza/coupon;
		int remainderCoupon = pizza%coupon;
		
		// ���
		while(additionalOrder > 0) {
			pizza += additionalOrder;
			additionalOrder /= coupon;
			int temp = additionalOrder%coupon;
			remainderCoupon += temp;
			if(remainderCoupon >= coupon) {
				pizza += 1;
				remainderCoupon -= coupon;
			}
		}
		
		// ���
		System.out.print(pizza);
	}
	
}