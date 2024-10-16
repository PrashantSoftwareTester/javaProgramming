package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethodsUse {

	public static void main(String[] args) {
		// declaration

		//HashMap hm=new HashMap();
		//Map hm=new HashMap();
		HashMap<Integer,String> hm=new HashMap<Integer,String>();

		//Adding data pairs to has hmap

		hm.put(101,"Scott");
		hm.put(102,"Marry");
		hm.put(103,"Dipak");
		hm.put(104,"John");
		hm.put(105,"Sunil");
		hm.put(106,"Raghav");
		hm.put(101,"John");

		System.out.println(hm);

		//find pairs
		hm.size();
		System.out.println(hm.size()); //6

		//remove the pairs

		hm.remove(103);
		System.out.println(hm);// after removing

		//getting specific value

		hm.get(102);
		System.out.println(hm.get(102));

		//print only keys

		hm.keySet();
		System.out.println(hm.keySet());

		//Print only values : do not have any value set method: only through looping it is possible

		for(Object k:hm.keySet())

		{
			System.out.println(hm.get(k));
		}

		// print both key and value

		for(Object k:hm.keySet())

		{
			System.out.println(k+"    " + hm.get(k));
		}

		//Clear	data

		hm.clear();

		System.out.println(hm);
		
		
		
		Map <String,Integer>m1=new HashMap();
		m1.put("ChennaiExpress", 1103);
		m1.put("TippuExpress", 1105);
		m1.put("KanyakumariExpress", 1107);
			
		System.out.println(m1.keySet());  //Prints only keys
	        
	/* 		Iterator it=m1.keySet().iterator();
			while(it.hasNext()){
				System.out.println(m1.get(it.next()));
			}
	         
	        //Print keys and values both
			for(Object k:m1.keySet())

			{;
				System.out.println(k+"    " + m1.get(k));
			}   */
	         
				





	}

}
