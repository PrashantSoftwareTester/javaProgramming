package programmingPractice;

public class FindLargestNoFromAnArray {

	public static void main(String[] args) {

		int[] a = {12, 5, 89, 50, 1, 109, -1};

		int len = a.length;

		int max = a[0];

		for(int i=1; i<len; i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}

		System.out.println("The Largest number is = "+max);










	}

}
