package programmingPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindCharacterCountForAStringArray {

	public static void main(String[] args) {

		String str1="";

		String [] str= {"bangalore","Prashant","Mumbai"};

		for(int i=0;i<=str.length-1;i++) {

			str1=str1+str[i];
		}
		System.out.println(str1);

		char [] ch=str1.toCharArray();

		Map<Character,Integer>m1=new LinkedHashMap<>();

		for(char x:ch) {
			if(m1.containsKey(x)) {
				m1.put(x,m1.get(x)+1);
			}else {
				m1.put(x, 1);
			}
		}

		System.out.println(m1);	




	}

}
