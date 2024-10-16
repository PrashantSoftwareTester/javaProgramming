package programmingPractice;

public class ReverseANumber {

	public static void main(String[] args) {

		int i=12564853;
		while(i!=0) {
			System.out.print(i%10);
			i=i/10;
		}
	}

}
