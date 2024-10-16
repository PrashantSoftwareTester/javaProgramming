package programmingPractice;

public class FindMultipleMissingNoFromArray {

	public static void main(String[] args) {

		int[] a= {1,2,5,7,8,10};

		int len=a.length;
		int LastVal=a[len-1];

		int[] b=new int[LastVal+1];

		for(int i=0;i<len;i++)
		{
			int val=a[i];
			b[val]=val;

		}

		for(int i=1;i<b.length;i++)	
		{
			if(b[i]==0)
			{
				System.out.println("The missing no is" +i);
			}

		}





	}

}
