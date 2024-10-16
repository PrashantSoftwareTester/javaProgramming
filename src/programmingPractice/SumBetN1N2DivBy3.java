package programmingPractice;

public class SumBetN1N2DivBy3 {

	public static void main(String[] args) {
		
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("Enter the number 1");
		int n1 = in.nextInt();
		
		System.out.println("Enter the number 2");
		int n2 = in.nextInt();
		
		int sum = 0;

		
		for(int i=n1; i<=n2; i++)
		{
			if(i%3==0)
			{
				sum = sum+i;
			}
		}
		System.out.println("The Total Sum  is = "+sum);

		
		
		
		
		
		
	}

}
