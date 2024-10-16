package oOPSConcept;

class A{
    int x=10;
	int y=20;
 }

class B extends A{

	int z=40;
	int D=50;
}

public class Inheritence {
   public static void main(String[] args) {

		B obj1=new B();
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		System.out.println(obj1.z);
		System.out.println(obj1.D);

		A obj2= new A();
		System.out.println(obj2.x);
		System.out.println(obj2.y);

	}

}
