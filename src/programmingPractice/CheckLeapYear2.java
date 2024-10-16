package programmingPractice;

import java.util.Scanner;

public class CheckLeapYear2 {

	public static void main(String[] args) {
        String yn;   
		Scanner scn=new Scanner(System.in);
		do { System.out.println("Please Enter a year");
		int year=scn.nextInt();
		if(year%4==0 || year%100==0 || year%400==0) {
			System.out.println("leap year");
		}else {
			System.out.println("Not Leap Year");
		}
		System.out.println("please enter y to continue or N for discontinue");
		yn=scn.next();
		}while(yn.equals("Y") || yn.equals("y")); 









	}

}
