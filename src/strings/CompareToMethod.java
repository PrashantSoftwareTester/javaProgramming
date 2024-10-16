package strings;

public class CompareToMethod {

	public static void main(String[] args) {
		String str1="ABC";
		String str2="ABC";
		String str3="BAC";
		String str4="ABC";
		String str5="ABC";
		String str6="BAC";
		
		System.out.println(str1.compareTo(str2));//0
		System.out.println(str3.compareTo(str4));//1
		System.out.println(str5.compareTo(str6));//-1
		
	}

}
