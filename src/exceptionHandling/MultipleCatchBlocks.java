package exceptionHandling;

//String s=Null  s.length(); = No value
//String s=""  s.length(); = Some value
//String s="welcome"  s.length(); = 7
//when we do not know the type of exception, then follow the below process example 1
//But there are thousands of exceptions, how to handle. refer below example 2

import java.util.Scanner;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		
		
				System.out.println("Program is started");		
				System.out.println("Program is in progress");	

				//Example 1
				 
				Scanner s=new Scanner(System.in);
				System.out.println("Enter a number");
				int num=s.nextInt();		
				String S=null;
/*               try
				{
			     //System.out.println(100/num);
				   System.out.println(S.length());	
					
					
				}
				catch(ArithmeticException e) //enter any variable because ArithmeticException is predefined class.
				{
				  System.out.println("Arithmatic Exception");	
				  
				}
				
				catch(NumberFormatException e) 
				{
				  System.out.println("NumberFormat Exception");	
				  
				}
				
				catch(NullPointerException e) 
				{
				  System.out.println("NullPointerException");	
				  
				}  */
				
	// Example 2:			
		
				 try
					{
				     
					 //  System.out.println(S.length());	
					 System.out.println(100/num);
				    }
				 
					catch(Exception e)  // Exception is the parent class for all exceptions class there in java.lang package.
					{
					  System.out.println("Exception Thrown");	
					  
					}
					
				 System.out.println("Program is completed");		
				 System.out.println("Program is exited");			
				
				
				
				

				 
				
				
				
				
				
				
				
			
				
				
				
				
				

		
		
		
		
		
		
		
		
		
		
		
	}

}
