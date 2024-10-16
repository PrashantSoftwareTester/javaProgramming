package programmingPractice;

import java.util.Scanner;

public class CheckDivisibilityDemo {

	public static void main(String[] args) {
	String yn;
	do {	
	int divident,divisor;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter divident");
	divident=s.nextInt();
	System.out.println("Enter divisor");
	divisor=s.nextInt();
	
	if(divident%divisor==0)
	{
	System.out.println("divisible");
	}
	else 
	{
	System.out.println("Not divisible");	
	}	
	
	System.out.println("Enter Y to continue or N to discontinue");
	yn=s.next();	
	}
	while(yn.equals("Y") || yn.equals("y"));
	
	

}
	
}	
	
	
	
