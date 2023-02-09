package array;

import java.util.Scanner;

public class odd_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		double[] odd = new double[no]; // here array store double value and array length is 10.
		// index maximum=length-1 so,10-1=9.index maximum=9.

		// double a=1.0; //in a using double value
		for (int i = 0; i < odd.length; i++) {
			int b = sc.nextInt();
			b = b + 2;
			odd[i] = b;

			System.out.println(odd[i]);

		}
		System.out.println(4 % 10); // 4%10 answer will be 4 in other way,remainder will be 4.
	}

}
