package programmingPractice;

import java.util.Scanner;

/*
        *
       **
      *** 
     **** 
    ***** 

*/    
public class StarPattern4 {
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter a number to print above pattern");
	int n=scn.nextInt();
	int nsp=n-1;
	int nst=1;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=nsp;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=nst;k++) {
			System.out.print("*");
		}
		nsp--;
		nst++;
		System.out.println();
	}
		
}

}
