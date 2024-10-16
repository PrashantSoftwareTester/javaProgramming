package oOPSConcept;

public class MethodOverloading {

	void create_contact(int number1) {
		System.out.println("Contact is created with 1 number");
	}
	
	void create_contact(int number1,int number2) {
		System.out.println("Contact is created with 2 numbers");
	}
	
	void create_contact(int number1,String email) {
		
		System.out.println("Contact is cretaed with number and email");
		
	}
	
	
	public static void main(String[] args) {
		
		MethodOverloading obj1=new MethodOverloading();
		
		obj1.create_contact(10);
		obj1.create_contact(20,30);
		obj1.create_contact(40,"mprashantkumar136@gmail.com");
		
		

	}

}
