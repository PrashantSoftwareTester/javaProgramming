package collectionFramework;

import java.util.ArrayList;

/*1. Heterogenous data - Allowed
  2. Insertion order - preserved(Index)
  3. Duplicate elements - Allowed
  4. Multiple Nulls - Allowed */

/*
 class Employee {
	int empno;
	String empname;

	void displ() {

		//code
	}
}*/

public class ArrayListDemo {

	public static void main (String [] args) {

		//declaration of ArrayList by creating object

		ArrayList mylist=new ArrayList();
		//ArrayList<Integer>mylist=new ArrayList<Integer>();//Only integers
		//List mylist=new ArrayList();
		/*Employee empobj1=new Employee();
	Employee empobj2=new Employee();
	Employee empobj3=new Employee();
	Employee empobj4=new Employee();*/



		// adding data elements into arraylist
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		//mylist.add(empobj1); // can add object also in collections


		//size of arraylist

		System.out.println(mylist.size());	//7	
		System.out.println(mylist);	//100, 10.5, Welcome, true, 100, null, null

		// remove value from arraylist

		mylist.remove(3);// used index
		System.out.println("After removing element" + mylist);// 100, 10.5, Welcome, 100, null, null

		//mylist.add(); adding in the end of the arraylist

		//inserting new element in the middle of the list.

		mylist.add(2,"java");
		System.out.println("After insertion" + mylist);// 100, 10.5, java, Welcome, 100, null, null
		//caputure specific value

		System.out.println(mylist.get(3));

		// Reading all the data from array list

		for(Object x:mylist)
		{
			System.out.println(x);
		}

		//Clearing all data from array list
		mylist.clear(); 
		System.out.println("After clearing" + mylist);

		//can not delete 2 or 3 elements at a time

  

	}



}
