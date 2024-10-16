package programmingPractice;

public class FindSingleMissingNoFromArray2 {

	public static void main(String[] args) {

		int[] a = {1, 2, 3,4,6};

		int len = a.length;

		int n = a[len-1]; // 6

		int total = n*(n+1)/2; // 21


		for(int i=0; i<=len-1; i++)
		{
			total = total-a[i];
		}	

		System.out.println("The missing number is = "+total);





	}

}
