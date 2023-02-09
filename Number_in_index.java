package array;

import java.util.Scanner;

public class Number_in_index {
	static int checking_number;
	void work(int[] value)
	{
		System.out.println("please enter the value");
		Scanner sca=new Scanner(System.in);
		for(int i=0; i<value.length; i++)
		{
			
			int a=sca.nextInt();
			value[i]=a;
		}
			
	}
	
	void check(int[] index_number,int checking_number)
	{
		for(int i=0; i<index_number.length; i++)
		{
			if(index_number[i]==checking_number)
			{
				System.out.println("checking number = "+checking_number+" index number = "+index_number[i]+", index = "+i+" have same number of checking number ");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter size value");
		int size = sc.nextInt();
		int[] value = new int[size];
		Number_in_index obj = new Number_in_index();
        obj.work(value);
        System.out.println("please enter checking number");
         checking_number=sc.nextInt();
        obj.check(value,checking_number);
	}

}
