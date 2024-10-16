package casting;

class A{

	void test1() {
		System.out.println("Test 1 of A");
	}

	void test2() {
		System.out.println("Test 2 of A");
	}

	void test3() {
		System.out.println("Test 3 of A");
	}
}

class B extends A{

	void test4() {
		System.out.println("Test 4 of B");
	}

	void test5() {
		System.out.println("Test 5 of B");
	}

	void test6() {
		System.out.println("Test 6 of B");
	}

	void test7() {
		System.out.println("Test 7 of B");
	}

}

public class DerivedCasting {

	public static void main(String[] args) {

		//Upcasting; 
		//create sub class object & assign it to super class reference.

          A obj1=new B();     // 3 methods of class A.

          
     //Downcasting;
     //Store super class reference to sub class reference.
     // Create super class object and assign it to sub class reference
     // in downcasting conversion/casting  is mandatory.
     //Without upcasting, downcasting can not be done.

            B obj2 = (B)new A();
            B obj3 = (B)obj1;
            


	}

}
