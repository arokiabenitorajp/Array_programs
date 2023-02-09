package array;

public class even_number {

	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] even=new int[5];
		//System.out.println(even[]);
		int a=2;
		
		
		for(int i=0; i<even.length; i++)  //here length of even array is 5. index start with 0  followed by 1,2,3,4
		{
			even[i]=a;               //in index 0 is 2,index 1 is 4,index 2 is 6,index 3 is 8,index 4 is 10.
			System.out.println(even[i]);
			a=a+2;
		}
		System.out.println(even[2]);    //here check the value of the particular index value. example: value of index 2 is 6.
	}	
		
	}


