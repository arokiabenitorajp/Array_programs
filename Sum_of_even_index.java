package array;

import java.util.Scanner;

public class Sum_of_even_index {
	
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
	public void allow(int[] arr)
	{
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			if(i%2==0)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println("sum of even index = "+sum);
	}
			
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter size value");
		int size = sc.nextInt();
		int[] value = new int[size];
		Sum_of_even_index obj = new Sum_of_even_index();
        obj.work(value);
        obj.allow(value);
	}

	
		
	}


