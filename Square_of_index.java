package array;

import java.util.Scanner;

public class Square_of_index {
	Scanner sca = new Scanner(System.in);
	void put_value(int[] array) {
		System.out.println("please enter the array 1 value");
		
		for (int i = 0; i < array.length; i++) {

			int a = sca.nextInt();
			array[i] = a;

		}

	}
	
	   void square_value(int[] array_1,int[] array_2)
	   {
		   for (int i = 0; i < array_1.length; i++) {

				array_2[i]=array_1[i]*array_1[i];

			}
	   }
	   
	   void print_square(int[] array_2) {
			for (int i = 0; i < array_2.length; i++) {
				System.out.println("after square first array index , second array index " + i + " = " + array_2[i]);
			}

		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter size  value");
		int size = sc.nextInt();
		int[] array_1 = new int[size];
		int[] array_2 = new int[size];
		Square_of_index obj=new Square_of_index();
		obj.put_value(array_1);
		obj.square_value(array_1,array_2);
		obj.print_square(array_2);
		
	}

}
