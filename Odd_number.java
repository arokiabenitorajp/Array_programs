package array;

public class Odd_number {
	
	void work(int[] number)
	{
		int i=0;
		for(int num=1;i<number.length; num++)
		{
			if(num%2!=0)
			{
				number[i]=num;
				i++;
			}
		}
	}
		void print(int[] arr)
		{
			for(int i=0; i<arr.length; i++)
			{
				System.out.println("odd number="+arr[i]+" ");
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Odd_number value= new Odd_number();
		int[] number=new int[5];
		
		value.work(number);
		value.print(number);
		
		
		
	}

}
