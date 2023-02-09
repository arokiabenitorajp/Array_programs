package array;

import java.util.Scanner;

public class A_is_subset_of_b {
	int count = 0;
	Scanner sca = new Scanner(System.in);

	void put_array_a(int[] array_a) {
		System.out.println("please enter the array a value");

		for (int i = 0; i < array_a.length; i++) {

			int a = sca.nextInt();
			array_a[i] = a;

		}

	}

	void put_array_b(int[] array_b) {
		System.out.println("please enter the array b value");

		for (int k = 0; k < array_b.length; k++) {

			int a = sca.nextInt();
			array_b[k] = a;

		}

	}

	void subset(int[] array_a, int[] array_b) {

		for (int i = 0; i < array_a.length; i++) {
			for (int k = 0; k < array_b.length; k++) {
				if (array_a[i] == array_b[k]) {
					count = count + 1;
				}
			}
		}
	}

	void verified(int size_1, int count, int size_2) {
		if (size_1 == count) {
			System.out.println("array a is subset of array b");
		}
		if (size_2 == count) {
			System.out.println("array b is subset of array a");
		}

		else {
			System.out.println("given array is not subset of another array");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter size 1  value of array a");
		int size_1 = sc.nextInt();
		int[] array_a = new int[size_1];
		A_is_subset_of_b obj = new A_is_subset_of_b();
		obj.put_array_a(array_a);

		System.out.println("please enter size 2  value of array b");
		int size_2 = sc.nextInt();
		int[] array_b = new int[size_2];
		obj.put_array_b(array_b);
		obj.subset(array_a, array_b);
		obj.verified(size_1, obj.count, size_2);
	}

}
