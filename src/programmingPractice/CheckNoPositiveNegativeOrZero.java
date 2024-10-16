package programmingPractice;

import java.util.Scanner;

public class CheckNoPositiveNegativeOrZero {

	public static void main(String[] args) {
	String yn;
	do{
		int num1;
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	num1=s.nextInt();
	
	/*if(num1>0)
	{
	System.out.println("Positive");
	}
	else
	{
	  if(num1<0)
	  {	
	    System.out.println("Negative");	
	  }
	  else
	  {
	    System.out.println("Zero");	
	  }	
	}	*/
	if(num1>0) {
	System.out.println("Positive");
	}
	else if(num1<0) {
	System.out.println("Negative");
	}
	else {
	System.out.println("Zero");
	}
	
		System.out.println("Press Y to continue or N to discontinue");
	    yn=s.next();
 }
	while(yn.equals("Y") || yn.equals("y"));
		
}

}
