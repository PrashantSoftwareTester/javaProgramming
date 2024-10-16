package programmingPractice;
/*
 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15
 */
public class NumberPattern1 {

	public static void main(String[] args) {

		System.out.println("Method1:------------------------------");	

		int i,j,k=1;
		for(i=1;i<=5;i++) {
			for(j=1;j<i+1;j++) {
				System.out.print(k++ + " ");
			}

			System.out.println("");
		}


		System.out.println("Method 2:------------------------------");	


		int count=1;
		for(int l=1;l<=5;l++) {
			for(int m=1;m<=l;m++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println(" ");
		}













	}

}
