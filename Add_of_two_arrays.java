
//add of two array index and put in to third array index
package array;

import java.util.Scanner;

public class Add_of_two_arrays {
	Scanner sca = new Scanner(System.in);
	void put_array_1(int[] array_1) {
		System.out.println("please enter the array 1 value");
		//Scanner sca = new Scanner(System.in);
		for (int i = 0; i < array_1.length; i++) {

			int a = sca.nextInt();
			array_1[i] = a;

		}

	}

	void put_array_2(int[] array_2) {
		System.out.println("please enter the array 2 value");
		
		for (int i = 0; i < array_2.length; i++) {

			int a = sca.nextInt();
			array_2[i] = a;

		}

	}

	void put_array_3(int[] array_3, int[] array_2, int[] array_1) {
		for (int i = 0; i < array_3.length; i++) {
			array_3[i] = array_1[i] + array_2[i];
		}

	}

	void print(int[] array_3) {
		for (int i = 0; i < array_3.length; i++) {
			System.out.println("third array index " + i + " = " + array_3[i]);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter size  value");
		int size = sc.nextInt();
		int[] array_1 = new int[size];
		int[] array_2 = new int[size];
		int[] array_3 = new int[size];
		Add_of_two_arrays obj = new Add_of_two_arrays();
		obj.put_array_1(array_1);
		obj.put_array_2(array_2);
		obj.put_array_3(array_3, array_2, array_1);
		obj.print(array_3);
	}

}
