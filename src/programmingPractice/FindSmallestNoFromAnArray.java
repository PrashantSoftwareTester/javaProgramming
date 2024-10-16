package programmingPractice;

public class FindSmallestNoFromAnArray {

	public static void main(String[] args) {

		int[] a = {12, 5, 89, 50, 1, 109, -1};

		int len = a.length;

		int min = a[0];

		for(int i=1; i<len; i++)
		{
			if(a[i]<min)
			{
				min = a[i];
			}
		}

		System.out.println("The Maximum number is = "+min);







	}

}
