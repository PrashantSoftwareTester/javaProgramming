package programmingPractice;

import java.util.Scanner;

public class FindAreaOfaTriangle {

	public static void main(String[] args) {
	
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter length");
		int length=scn.nextInt();
		System.out.println("Enter breadth");
		int breadth=scn.nextInt();
		int area=length*breadth/2;
		System.out.println("Area of the triangle is : "+area+" sqms");
		
		
		
		
		

	}

}
