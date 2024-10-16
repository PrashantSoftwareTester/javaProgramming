package programmingPractice;

public class FindSingleCharacterCount {

	public static void main(String[] args) {
		String str="bangalore";
		int srch=0;
		String ch="a";
		int count=0;
		while(str.indexOf(ch,srch)!=-1) {
			count++;
			srch=str.indexOf(ch,srch)+1;
		}
		System.out.println(count);

	}

}
