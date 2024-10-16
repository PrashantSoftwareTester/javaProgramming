package collectionFramework;

import java.util.ArrayList;

public class CollectionInterfaceDemo {

	public static void main(String[] args) {

		ArrayList al1=new ArrayList();

		al1.add(100);
		al1.add(200);
		al1.add(300);
		al1.add("aaa");

		System.out.println(al1);

		ArrayList al2=new ArrayList();

		al2.add("aaa");
		al2.add("bbb");
		al2.add("ccc");
		//System.out.println(al2.add("aaa")); provides boolean value : if added true otherwise false.
		System.out.println(al2);

		//al1.addAll(al2);

		//System.out.println(al1);

		//System.out.println(al1.contains(500));
		//System.out.println(al1.isEmpty());
		//System.out.println(al1.size());


		//System.out.println(al1);
		//al1.remove(100);// ArrayList method. Index is needed.   not considering integers, only string. whey integers then put index to remove
		//al1.remove(0);  // by index

		//System.out.println(al1);
		//al1.remove("aaa"); // Collection interface method, we are passing object.
		//System.out.println(al1);
		//al1.remove(0);
		//System.out.println(al1);

		//al1.removeAll(al2);
		//System.out.println(al1);

		//al1.clear();
		//System.out.println(al1);

		//al1.contains("aaa");
		//System.out.println(al1.contains("aaa"));
		//al1.containsAll(al2);
		//System.out.println(al1.containsAll(al2));

		//al1.iterator();









	}

}
