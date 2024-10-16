package programmingPractice;
/*

 * * * *
 * * * *
 * * * *
 *
 *
 *

 */
public class StarPattern6 {
	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=4;j++) {
				if(i>3 && j>1) {
					break;
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
