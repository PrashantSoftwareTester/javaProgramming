package exceptionHandling;
/*
 * checked exceptions can be handled in two ways.
 * 1. add throws declaration 2. Surround with try/catch block.
 * Note try..catch is statement level exception.
 * Note throws keyword is method level statement.gives intrupted exception in run time. Thread is process. 
 * Note unchecked exceptions are handled on by try...catch block.
 * 
 * 
 * 
 * 
 */


public class CheckedExceptionsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Program is started");		
		System.out.println("Program is in progress");
		
		
		/* try 
		{
			Thread.sleep(5000);   // for 5 second pause.
		} 
		
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}   */
		
		
		// throws process.
		
		Thread.sleep(5000);
		
		
		 System.out.println("Program is finished");		
		 System.out.println("Program is Terminated");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
