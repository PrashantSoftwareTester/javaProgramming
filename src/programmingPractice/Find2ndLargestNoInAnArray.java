package programmingPractice;

public class Find2ndLargestNoInAnArray {

	public static void main(String[] args) {

		int[] a = {5, 12, 89, 50, 1, 9, -1};

		int len = a.length;
		int max1=0;
		int max2=0;

		if(a[0]>a[1])
		{
			max1 = a[0];
			max2 = a[1];
		}
		else if(a[0]<a[1])
		{
			max1 = a[1];
			max2 = a[0];
		}

		for(int i=2; i<len; i++)
		{
			if(a[i]>max1 && a[i]>max2)
			{
				max2 = max1;
				max1 = a[i];
			}
			else if(a[i]<max1 && a[i]>max2)
			{
				max2 = a[i];
			}
		}

		System.out.println("The 2nd Maximum number is = "+max2);







	}

}
