
package constructorpractice;

public class ConstructorOverloading {
	
	long account,PhoneNo,Contact;
	String app;
	
	ConstructorOverloading(){
		System.out.println("UPI Transaction Process");
	}
	
	ConstructorOverloading(long Contact){
		this();  //use of call to this.
		this.Contact=Contact;  //use of this.
		System.out.println("ContactNo Entered"+Contact);
		}
	
	ConstructorOverloading(String app){
		this(990141432);
		this.app=app;
		System.out.println("UPI app selected"+app);
	}
	
	ConstructorOverloading(long account,long PhoneNo,String app){
		this(app);
		this.account=account;
		this.PhoneNo=PhoneNo;
		System.out.println("Account and phoneno linked to the app"+app);
	}
	
 
	public static void main(String[] args) {
 
		ConstructorOverloading obj1=new ConstructorOverloading(9352500100030501l,9686701451l,"gpay");
		System.out.println(obj1);
		
		
	}
	

}