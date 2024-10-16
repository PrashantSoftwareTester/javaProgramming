package programmingPractice;

public class FindSingleMissingNoFromArray1 {

	public static void main(String[] args) {

		int[] a= {1,2,3,4,5,6,7,9};
		int len=a.length;
		for(int i=0;i<=len-1;i++)
		{
			if(a[i+1]!=a[i]+1)
			{
				System.out.println("missing no is " + (a[i]+1));
				break;
			}

		}

	}

}
