package programmingPractice;

import java.util.Scanner;

/*
 
 *
 **
 ***
 ****
 *****

 */
public class StarPattern3 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		int nst=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=nst;j++) {
				System.out.print("*");
			}
			nst++;
			System.out.println();
		}


	}

}
