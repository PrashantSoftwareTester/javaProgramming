package exceptionHandling;

import java.util.Scanner;

/*We use:   try...catch block
 * catch(ArithmeticException e) where e stores the exception details.
 * One try block can have multiple catch blocks.
 * If there are multiple exceptions, we can handle by using mulitple try...catch blocks.
 * 
 * 
 * 
 * 
 */
public class HandleException {

	public static void main(String[] args) {
		System.out.println("Program is started");		
		System.out.println("Program is in progress");	

		//Example 1
		 Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();		
		
		try
		{
	     System.out.println(100/num);    //Arithmetic Exception
		}
		catch(ArithmeticException e) //enter any variable because ArithmeticException is predefined class.
		{
		  System.out.println("You have entered invalid input");	
		  //e.printStackTrace();
		  //System.out.println(e.getMessage());
		  //e.getMessage();
		}
		
	System.out.println("Program is completed");		
	System.out.println("Program is exited");	
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		

	}

}
