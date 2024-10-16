package programmingPractice;

import java.util.Scanner;
//Condition 1:
//Prime Number: a numer that is divisible only by 1 and itself.ie. always have two divisor.
//Example: 2,3,5,7,11,13...



public class CheckPrimeOrNot1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a numbe to check");
		int n=s.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}

		}
		if(count==2) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}





	}

}


