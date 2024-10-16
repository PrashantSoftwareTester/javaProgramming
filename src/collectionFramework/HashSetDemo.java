package collectionFramework;

import java.util.HashSet;

/*1. Heterogenous data - Allowed
2. Insertion order - Not preserved(Index not supported)
3. Duplicate elements - Not Allowed
4. Multiple Nulls - Not Allowed, only single null allowed */ 

public class HashSetDemo {

	public static void main(String[] args) {

		// declaration
		HashSet myset=new HashSet();

		//Set myset=new HashSet();

		//HashSet<Integer> myset=new HashSet<Integer>();

		// Add and print data

		myset.add(100);
		myset.add(10.5);
		myset.add("Welcome");
		myset.add(100);
		myset.add(null);
		myset.add(null);

		System.out.println(myset); // [null, 100, 10.5, Welcome] // insertion order not preserved

		//Find size

		System.out.println(myset.size());//4

		// remove element 
		myset.remove(10.5); // pass value not  index

		System.out.println("After removing " + myset);//[null, 100, Welcome]

		// Insertion is not possible in HashSet.Always value will be added in the end

		// get specific value : Not possible

		// read the data

		for(Object x:myset)  // for each loop, you can use any loop

		{
			System.out.println(x);
		}












	}

}
