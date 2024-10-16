package programmingPractice;

public class PrintIncreasingOrderUsingRecursion {

	public static void inc(int N) {
		if(N==1) {
			System.out.println(1);
			return;
		}

		inc(N-1);
		System.out.println(N);
		return; 
	}
	public static void main(String[] args) {

		PrintIncreasingOrderUsingRecursion.inc(5);
	}

}
