package array;

import java.util.Scanner;

public class Product_of_element {
	int multiple=1;
	void work(int[] value)
	{
		System.out.println("please enter the value");
		Scanner sca=new Scanner(System.in);
		for(int i=0; i<value.length; i++)
		{
			
			int a=sca.nextInt();
			value[i]=a;
			//System.out.println(value[i]);
		}
			
	}
	
	void product(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
		 multiple=multiple*arr[i];
			
		}
		System.out.println("product of element = "+multiple);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter size value");
		int size = sc.nextInt();
		int[] value = new int[size];
		Product_of_element obj = new Product_of_element();
        obj.work(value);
        obj.product(value);
	}

}
