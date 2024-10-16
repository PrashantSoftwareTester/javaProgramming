package programmingPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindCharacterCountUsingHashMap {

	public static void main(String[] args) {
		String str="bangalore";
		Map <Character,Integer> m1 = new LinkedHashMap<Character,Integer>();
		char [] ch=str.toCharArray();
		for(char x:ch) {
			if(m1.containsKey(x)) {
				m1.put(x,m1.get(x)+1);
			}else {
				m1.put(x,1);
			}
		}
		System.out.println(m1);






	}

}
