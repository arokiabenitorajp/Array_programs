package array;

import java.util.Scanner;

public class Value {
	static int i = 0;

	void print(int[] arr) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

	}

	void show(int[] array)

	{
		for (int i = array.length-1; i >= 0; i--) {

			System.out.println("array index value="+array[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter size");
		int size = scan.nextInt();

		int[] arr = new int[size];
		System.out.println("please enter value");

		Value obj = new Value();
		obj.print(arr);
		// System.out.println(arr);
		obj.show(arr);
	}

}
