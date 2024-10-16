package programmingPractice;

import java.util.Scanner;

public class CheckEvenOddNumber1 {

	public static void main(String[] args) {
	
		String yn;
	//Input=number, 
    //ouput=even, odd
	//Logic
	do
	
	{Scanner s=new Scanner(System.in);
	System.out.println("Enter a number to check");
    int	number=s.nextInt();
	
	if(number%2==1)
	{
	System.out.println("Odd");
	}
	else
	{		
	System.out.println("Even");	
	}	
	
	System.out.println("Enter Y to continue or N to discontinue");
	yn=s.next();
	}
	while(yn.equals("Y") || yn.equals("y"));	
		
		
		
		

	}

}
     
		
