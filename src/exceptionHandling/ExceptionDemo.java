package exceptionHandling;

import java.util.Scanner;

public class ExceptionDemo {
/*Exception Handling: 
 * Errors: 1. Syntax: Human error 2. Logical: Unexpected output
 * Exception: when user input wrong value, program will terminate
 * Exception Handling: inform the user about wrong input without terminating the program.
 * Exception 2 types: 1. checked: Automatically identified by java, after that we need to handle 2. Un-checked: We have to findout. Not identified by java compiler.
 * Examples of checked exception: File not found, IOException etc.
 * Examples of unchecked exception: ArithmeticException,NullPointerException,ArrayIndexOutofBoundsExceptions etc.
 * All exceptions are predefined class in java.
 * 
 * 
 * 
 * 
 * 
 */
public static void main(String[] args) {
   		
System.out.println("Program is started");		
System.out.println("Program is in progress");	

//Example 1
/* Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int num=s.nextInt();		
System.out.println(100/num);	Arithmetic Exception	*/

//Example 2
/* int a[]=new int[5];
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int num=s.nextInt();
System.out.println("Enter position(0-4)");
int pos=s.nextInt();
a[pos]=num;

System.out.println(a[pos]); //ArrayIndexOutofBoundsException if Index is wrong by user.
*/
//Example-3
 /* String s="welcome";
 Integer.parseInt(s); //Converting string to integer: number format exception.
 int num=Integer.parseInt(s); //Storing integer value in num variable.
 System.out.println(num);  */
 
System.out.println("Program is completed");		
System.out.println("Program is exited");		
		

		

	}

}
