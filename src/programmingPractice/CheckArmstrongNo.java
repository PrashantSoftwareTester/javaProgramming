package programmingPractice;

import java.util.Scanner;

/*
 Armstrong number is a number that is equal to the sum of cubes of its digits.
 
 input 153:  1^3+5^3+3^3=153
 
*/

public class CheckArmstrongNo {
	public static void main(String[] args) {
		int ExpValue=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to check");
		int n=s.nextInt();
		int backup=n;
		int sum=0;
		while(n>0)
		{
			System.out.println(n%10);
			sum=sum +(n%10)*(n%10)*(n%10);
			n=n/10;
			
		}
		
		
		if(backup==sum)
		{
		System.out.println("Armstrong Number");
		}
		else
		{
		System.out.println("Not Armstrong Numner");
		}
		
		
		
		
		
		
	}
}
