package StaticAndNonStatic;

public class ExampleStaticNonStatic1 {
    
	static int k=5;
	int i=10;
	int j=20;
	
	public static void main(String[] args) {
		
		ExampleStaticNonStatic1 obj1=new ExampleStaticNonStatic1();
		ExampleStaticNonStatic1 obj2=new ExampleStaticNonStatic1();
		
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		System.out.println(obj2.i);
		System.out.println(obj2.j);
		
		System.out.println(ExampleStaticNonStatic1.k);
		
		System.out.println("After overriding");
		
		obj1.i=30;
		obj1.j=40;
		obj2.i=50;
		obj2.j=60;
		ExampleStaticNonStatic1.k=100;
		
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		System.out.println(obj2.i);
		System.out.println(obj2.j);
		
		System.out.println(ExampleStaticNonStatic1.k);
		
	    System.out.println(obj1.k);
	    
	    ExampleStaticNonStatic1 obj3=new ExampleStaticNonStatic1();
	    System.out.println(obj3.i);
	    System.out.println(obj3.j);
	    System.out.println(obj3.k);
	    
	}

}
