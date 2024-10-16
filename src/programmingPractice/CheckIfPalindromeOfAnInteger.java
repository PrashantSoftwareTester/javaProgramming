package programmingPractice;

public class CheckIfPalindromeOfAnInteger {

	public static void main(String[] args) {
		int a=12345;
		int original=a;
		int rev=0;
		while(a!=0) {
		int rem=a%10;
		rev=rev*10+rem;
		a=a/10;
		}
	   if(original==rev) {
		   System.out.println("a is palindrome");
	   }else {
		   System.out.println("a is not palindrome");
	   }	
	}

}
