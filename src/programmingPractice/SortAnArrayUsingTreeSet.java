package programmingPractice;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class SortAnArrayUsingTreeSet {

	public static void main(String[] args) {
		String [] str = {"chennai","mumbai","bangalore","delhi","bhubaneswar","pune","surat"};
	    Set s1=new TreeSet();
	    Collections.addAll(s1,str);
	    System.out.println(s1);

	}

}
