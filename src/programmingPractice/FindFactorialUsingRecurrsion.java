package programmingPractice;

public class FindFactorialUsingRecurrsion {

	public static int fact(int N) {

    	if(N==1) {
			return 1;
		} 
		int temp=fact(N-1);
		return N*temp; 
	}
	public static void main(String[] args) {


		System.out.println(FindFactorialUsingRecurrsion.fact(10));






	}

}
