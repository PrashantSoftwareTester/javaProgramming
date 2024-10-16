package strings;

public class ToCharArrayMethod {

	public static void main(String[] args) {
		String str="bangalore";
		char [] ch=str.toCharArray(); //Converts string str to character array ch.
		
		//Print array elements
		for(int i=0;i<=ch.length-1;i++) {
			System.out.print(ch[i]+" ");
		}
		
		System.out.println();
		
		//Reverse and print array elements.
		for(int j=ch.length-1;j>=0;j--) {
			System.out.print(ch[j]+" ");
		}
		
		

	}

}
