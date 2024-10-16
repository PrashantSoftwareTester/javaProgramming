package programmingPractice;

import java.util.Scanner;

public class GreateroftwoNumbers {

	public static void main(String[] args) {
		
		 String yn; int a,b;
		
		do {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the first number a");
			a=s.nextInt();
			System.out.println("Enter the second number b");
			b=s.nextInt();
			
	if(a>b) {
			System.out.println("a is greater");
		    }
	else    {
			System.out.println("b is greater");
		    }
		    System.out.println("Enter Y to continue or N to discontinue");
		   yn=s.next();
	
	}
	      while(yn.equals("Y") || yn.equals("y"));	
	}

}
