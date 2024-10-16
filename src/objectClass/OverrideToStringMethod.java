package objectClass;

class Dog{
	
	String name="jimmy";
	
	 public String tostring() {
		
		return this.name;
	}
	
}
public class OverrideToStringMethod {

	public static void main(String[] args) {
		
		Dog d1=new Dog();
		System.out.println(d1.tostring());
		
		
		
		

	}

}
