package programmingPractice;

public class ReverseAString2 {

	public static void main(String[] args) {
		String str="bangalore";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}

}
