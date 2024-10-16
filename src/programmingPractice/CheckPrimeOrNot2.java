package programmingPractice;

import java.util.Scanner;

public class CheckPrimeOrNot2 {
/*
Condition 2:
A number is always divisible by number till n/2.
Always a number will be divisible by 1 & itself. so no need to check. 
we can check starting 2 till n/2.
*/
	
	// Note: Not working for 1.
	
	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number to check");
	int n=s.nextInt();
	boolean condition = true;
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			condition=false;
			break;
		}
		
	}
	
	if(condition==true) {
	System.out.println("Prime Number");
	}else
	{
	System.out.println("Not Prime Number");
	}	
		
		

	}

}
