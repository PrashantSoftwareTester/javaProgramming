package programmingPractice;

import java.util.Scanner;

public class FibonacciSeries {
  
	public static void main(String[] args) {
	
     Scanner s=new Scanner(System.in);
     System.out.println("Enter a number");
	 int n=s.nextInt();
	 int a=0;
	 int b=1;
	 int c=0;
	 
	 for(int i=0;i<=n;i++)
	 {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		 
		 
	 }
		
		
	
 
 }
		
}
