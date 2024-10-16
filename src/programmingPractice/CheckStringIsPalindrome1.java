package programmingPractice;

public class CheckStringIsPalindrome1 {

	public static void main(String[] args) {
		String str="malayalam";
		String revstr="";
		for(int i=str.length()-1;i>=0;i--) {
			revstr=revstr+str.charAt(i);
			}
		if(str.equals(revstr)) {
			System.out.println("The given string is palindrom");
		}else {
			System.out.println("Then given string is not palindrom");
		}
		
		
		
		

	}


}
