package objectClass;

class Eog{
	
	String name="Jimmy";
}

public class EqualsMethod {

	public static void main(String[] args) {
		
		Eog d1=new Eog();
		System.out.println(d1);
		
		
		Eog d2=new Eog();
		System.out.println(d2);
		
		System.out.println(d1.equals(d2));
		

	}

}
