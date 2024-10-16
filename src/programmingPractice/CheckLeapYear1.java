package programmingPractice;

public class CheckLeapYear1 {

	public static void main(String[] args) {
		int year=1800;
		if(year%4==0) 
		{
			if(year%100==0) 
			{if(year%400==0) 
			{
				System.out.println("leap year");
			}
			else 
			{
				System.out.println("not a leap year");
			}
			}
			else 
			{
				System.out.println("leap year");
			}

		}
		else 
		{
			System.out.println("not a leap year");
		}

		//2nd method

		int a=2024;
		if((a%400==0) || (a%4==0 && a%100!=0))
		{
			System.out.println("leap year");
		}
		else {
			System.out.println("not a leap year");
		}

	}

}
