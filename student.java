package array;

public class student {
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student boy =new student();
		
		System.out.println(boy.getClass()); //to find the class name of specific object (object.getClass();) put this in sop.it show the packege name and class name 
     int roll_no[]=new int[8];
     int var=1;
     
     for(int i=0; i<roll_no.length; i++)
		{
    	 
    	 roll_no[i]=var;
    	 var++;
    	
    	  
    	 
    	 System.out.println(roll_no[i]);
		}
	}

}
