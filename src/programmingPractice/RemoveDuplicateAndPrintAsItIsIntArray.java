package programmingPractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateAndPrintAsItIsIntArray {

	public static void main(String[] args) {
		
		//for integer array
		/*
		 * Integer [] arr= {1,2,7,2,3,4,5,7,1,2,3,4}; 
		 * Set s1=new LinkedHashSet();
		 * Collections.addAll(s1,arr); System.out.println(s1);
		 */
		
		//for int array
		int [] arr= {1,2,7,2,3,4,5,7,1,2,3,4};
		Set st=new LinkedHashSet();
		for(int num:arr) {
			st.add(num);
		}
		System.out.println(st);
	
		
		
		
		

	}

}
