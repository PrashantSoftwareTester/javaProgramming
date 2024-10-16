package programmingPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckifStringsinStringArrayisPalindrome {
	
	public static void main(String[] args) {

		String [] arr1={"Prashant","Malayalam","Rohan","Thyagraj","Interview"};

		for(int i=0;i<=arr1.length-1;i++) {

			String str1=arr1[i];
			String  rev="";

			for(int j=str1.length()-1;j>=0;j--) {

				rev=rev+str1.charAt(j);
			}

			if(str1.equalsIgnoreCase(rev)) {
				System.out.println(arr1[i]+ " Palindrome");
			}else {
				System.out.println(arr1[i]+" Not Palindrome");
			}

		}

   }
}


/* Using Collections
 public class RoughDemo {

	public static void main(String[] args) {

		String [] arr1={"Prashant","Malayalam","Rohan","Thyagraj","Interview"};

		List<String>l1=new ArrayList<>();
		Collections.addAll(l1,arr1);
		//System.out.println(l1);

		for(String str:l1) {

			String reversed = reverseString(str);
			if (str.equalsIgnoreCase(reversed)) {
				System.out.println(str + " Palindrome");
			} else {
				System.out.println(str + " Not Palindrome");
			}
		}

	}
   private static String reverseString(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		return reversed;
	}

}
  
  
  
  
  */
