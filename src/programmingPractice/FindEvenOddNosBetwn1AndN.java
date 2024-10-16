package programmingPractice;

import java.util.Scanner;

public class FindEvenOddNosBetwn1AndN {

	public static void main(String[] args) {
		String odd="";
		String even="";
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();

		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				even=even+i+",";
			}else {
				odd=odd+i+",";
			}
		}	
		System.out.println("Even Nos "+even);
		System.out.println("Odd Nos "+odd);
	}

}
