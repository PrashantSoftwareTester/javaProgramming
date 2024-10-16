package programmingPractice;

public class Find2ndSmallestNoInAnArray {

	public static void main(String[] args) {

		int[] a = {51, 12, 89, 50, 11, 10, 91, -2};

		int len = a.length;
		int min1=0;
		int min2=0;

		if(a[0]<a[1])
		{
			min1 = a[0];
			min2 = a[1];
		}
		else if(a[0]>a[1])
		{
			min1 = a[1];
			min2 = a[0];
		}

		for(int i=2; i<len; i++)
		{
			if(a[i]<min1 && a[i]<min2)
			{
				min2 = min1;
				min1 = a[i];
			}
			else if(a[i]>min1 && a[i]<min2)
			{
				min2 = a[i];
			}
		}

		System.out.println("The 2nd minium number is = "+min2);










	}

}
