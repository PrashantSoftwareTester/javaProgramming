package exceptionHandling;

// finally block always followed by catch block. finally is an optional blocks.
//After finally if we put statement doesnot execute if exception occured. if exception not occured, it will execute.
//If there are multiple catch blocks, then we will put finally block at last.
//Finally and try should be one block, and we can put multiple catch blocks.
/* There are three cases of finally blocks
   Case 1  Exception occured, catch block handled, finally block will execute.
   Case 2  Exception occured, catch block not handled, finally block will execute.
   Case 3  Exception doesnot occured,catch block ignored, finally block will execute.
   
 Note : in try , catch and finally blocks we can put multiple statements also.   when we do not know which line throws exception, then we can put all lines in try block.
 Note: Exceptions are compared with each catch block exceptions.
 Note: When we put (Exception e) in catch blocks then exception will be compared with thousands of exceptions by java.
 



*/

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("Program is started");		
		System.out.println("Program is in progress");	

		//Example 1
		 
/*		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();		
		String S=null;
        
		try
		{
	     
		   System.out.println(S.length());	
		}
		catch(Exception e)
		{
		  System.out.println("Exception Occured .. Handled");	
		  
		}
		
		finally
		{
		 	System.out.println("Entered into finally block");
			
		} */
		
		
//		Example 2
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();		
		String S=null;
        
		try
		{
	     
		   System.out.println(S.length());	
		}
		catch(ArithmeticException e)   // program terminated because exception not handled by catch block.
		{
		  System.out.println("Exception Occured .. Handled");	
		  
		}
		
		finally
		{
		 	System.out.println("Entered into finally block");
			
		}
		
		
		
		
		
		
		
		
		
		
		System.out.println("Program is completed");		
		 System.out.println("Program is exited");		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
