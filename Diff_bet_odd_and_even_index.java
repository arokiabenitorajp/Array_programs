package array;

import java.util.Scanner;

public class Diff_bet_odd_and_even_index {
	int sum_odd = 0;
	int sum_even = 0;

	void work(int[] value) {
		System.out.println("please enter the value");
		Scanner sca = new Scanner(System.in);
		for (int i = 0; i < value.length; i++) {

			int a = sca.nextInt();
			value[i] = a;
			// System.out.println(value[i]);
		}

	}

	public void add_odd(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				sum_odd = sum_odd + arr[i];
			}
		}
		System.out.println("sum of odd index = " + sum_odd);
	}

	public void add_even(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				sum_even = sum_even + arr[i];
			}
		}

		System.out.println("sum of odd index = " + sum_even);
	}

	void difference(int sum_odd, int sum_even) {
		int diff = sum_odd - sum_even;
		System.out.println("Diff_bet_odd_and_even_index = " + diff);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter size value");
		int size = sc.nextInt();
		int[] value = new int[size];
		Diff_bet_odd_and_even_index obj = new Diff_bet_odd_and_even_index();
		obj.work(value);
		obj.add_odd(value);
		obj.add_even(value);
		obj.difference(obj.sum_odd, obj.sum_even);

	}

}
