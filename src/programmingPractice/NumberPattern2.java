package programmingPractice;

/*

1
2*2
3*3*3
3*3*3
2*2
1

*/

public class NumberPattern2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
				if (j < i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}



		// Lower part of the pattern
		for (int i = 3; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
				if (j < i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}










	}

}
