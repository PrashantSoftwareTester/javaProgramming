package programmingPractice;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a,b,t; String yn;
		do {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter first no");
			a=s.nextInt();
			System.out.println("Enter second no");
			b=s.nextInt();
			t=a;
			a=b;
			b=t;
			System.out.println("a:" + a);
			System.out.println("b:" + b); 

			//2nd method without using the third variable


			/*a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b); */

			System.out.println("Enter Y to continue or N to discontinue");
			yn=s.next();

		}
		while(yn.equals("Y")||yn.equals("y"));


	}

}
