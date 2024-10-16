package programmingPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondHighestRepeatedCharacterinaString {
	
	public static char secondHighRepetedChar(String s) {

		Map<Character,Integer>m1=new HashMap<>();

		char [] arr=s.toCharArray();

		for(char X:arr) {
			if(m1.containsKey(X)) {
				m1.put(X,m1.get(X)+1);
			}else {
				m1.put(X, 1);
			}
		}

		List<Integer>l1=new ArrayList<>(m1.values());

		Collections.sort(l1,Collections.reverseOrder());
		int secondhighestfrequency=l1.get(1);

		for(Map.Entry<Character,Integer> entry:m1.entrySet()){

			if(entry.getValue()==secondhighestfrequency) {
				return entry.getKey();
			}
      }

		return '\0';
}

	public static void main(String[] args) {
        
		String s1 = "abgffteeee";
		String s2 = "awesdewrwserw";
		String s3 = "eeereeettrrttt";

		System.out.println(secondHighRepetedChar(s1));  // Output: f
		System.out.println(secondHighRepetedChar(s2));  // Output: e
		System.out.println(secondHighRepetedChar(s3));  // Output: e
     }

}
