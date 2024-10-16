package programmingPractice;

public class Sort0and1FromAnArray {

	public static void main(String[] args) {
		int[] a = {0, 1, 0, 0, 1, 1, 0, 0, 1, 1};

		int len = a.length;

		int count0 = 0;

		for(int i=0; i<len; i++)
		{
			if(a[i]==0)
			{
				count0++;
			}
		}

		for(int i=0; i<=count0-1; i++)
		{
			a[i] = 0;
		}

		for(int i=count0; i<len; i++)
		{
			a[i]=1;
		}

		System.out.println("Array After swaping");

		for(int i=0; i<len; i++)
		{
			System.out.print(a[i]+" " );
		}








	}

}
