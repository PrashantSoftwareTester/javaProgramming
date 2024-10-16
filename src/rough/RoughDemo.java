package rough;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
public class RoughDemo {
	public static String rollCharacters(String s, int[] roll) {

		char [] arr=s.toCharArray();	
		int n=arr.length;
		int[] rollCount = new int[n];
		for (int r : roll) {
			rollCount[0] += 1;
			if (r < n) {
				rollCount[r] -= 1;
			}
		}

		int currentRoll = 0;
		for (int i = 0; i < n; i++) {
			currentRoll += rollCount[i];
			arr[i] = (char)((arr[i] - 'a' + currentRoll) % 26 + 'a');
		}

		return new String(arr);

	}

    public static void main(String[] args) {

		String s = "bca";
        int[] roll = {1, 2, 3};
        
        String output = rollCharacters(s, roll);

        System.out.println(output); 

     }
}





