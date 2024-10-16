package strings;

public class ReplaceAllRegularExp {

	public static void main(String[] args) {

		String str="pr12as6hant";
		//String str1=str.replaceAll("[0-9]","" ); // Used Regular Expression
		// String str2=str.replace("pr", "Ta");
		String str3=str.replaceAll("pr", "Ta");
		System.out.println(str3);


		/*	
		for(int i=str1.length()-1;i>=0;i--) {
			System.out.print(str1.charAt(i));
		} */

	}

}
