package array;

import java.util.Scanner;

public class Array_index_add_5 {
	Scanner sca = new Scanner(System.in);
	void put_value(int[] array) {
		System.out.println("please enter the array 1 value");
		
		for (int i = 0; i < array.length; i++) {

			int a = sca.nextInt();
			array[i] = a;

		}

	}
	
	   void add_5(int[] array_1,int[] array_2)
	   {
		   for (int i = 0; i < array_1.length; i++) {

				array_2[i]=array_1[i]+5;

			}
	   }
	   
	   void print_index(int[] array_2) {
			for (int i = 0; i < array_2.length; i++) {
				System.out.println("after add 5 in first array index , second array index " + i + " = " + array_2[i]);
			}

		}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter size  value");
		int size = sc.nextInt();
		int[] array_1 = new int[size];
		int[] array_2 = new int[size];
		Array_index_add_5 obj=new Array_index_add_5();
		obj.put_value(array_1);
		obj.add_5(array_1,array_2);
		obj.print_index(array_2);
		
		
	}

}
