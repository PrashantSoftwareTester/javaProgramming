package programmingPractice;

import java.util.Scanner;

public class CheckNumberOfDaysInaMonth {

	public static void main(String[] args) {
		int month; String yn;
		do {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the month");
		month=s.nextInt();
		
		/*if(month==1)
		{System.out.println("31");}
		else if(month==2)
		{System.out.println("28 or 29");}
		else if(month==3)
		{System.out.println("31");}
		else if(month==4)
		{System.out.println("30");}
		else if(month==5)
		{System.out.println("31");}
		else if(month==6)
		{System.out.println("30");}	
		else if(month==7)
		{System.out.println("31");}	
		else if(month==8)
		{System.out.println("31");}
	    else if(month==9)
	    {System.out.println("30");}
	    else if(month==10)	
	    {System.out.println("31");}
	    else if(month==11)
	    {System.out.println("30");}
	    else if(month==12)
	    {System.out.println("31");}
	    else
	    {System.out.println("please input valid month");} */
		
		//2nd method using switch
		
		switch(month){
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:System.out.println("31");break;
		case 4:case 6:case 9:case 11:System.out.println("30");break;
		case 2:System.out.println("28 or 29");break;
		default:System.out.println("invalid month");break;
		}
	     System.out.println("Enter Y to continue or N to discontinue");
		 yn=s.next();
		}while(yn.equals("Y") || yn.equals("y"));
}
}
