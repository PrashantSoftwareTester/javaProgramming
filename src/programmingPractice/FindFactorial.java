package programmingPractice;

import java.util.Scanner;

public class FindFactorial {


	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int fact=1;

		for(int i=n;i>=1;i--)
		{
			fact=fact*i;


		}

		System.out.println("factorial of "+ n + " is " + fact);






	}

}
