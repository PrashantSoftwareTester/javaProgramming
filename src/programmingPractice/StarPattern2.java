package programmingPractice;

import java.util.Scanner;

public class StarPattern2 {
/* 
      ****
      ****
      ****
      ****
*/	
	public static void main(String[] args) {
		int nst=4;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number to print *");
		int n=scn.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=nst;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
