package programmingPractice;

import java.util.Scanner;

public class Add1toN {

	public static void main(String[] args) {
		String yn;
		do {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a number");
			int n=s.nextInt();

			int sum=0;

			for(int i=1;i<=n;i++)
			{

				sum=sum+i;

			}

			System.out.println(sum);

			System.out.println("Enter Y to continue or N to discontinue");
			yn=s.next();

		}

		while(yn.equals("Y") || yn.equals("y"));

	}

}
