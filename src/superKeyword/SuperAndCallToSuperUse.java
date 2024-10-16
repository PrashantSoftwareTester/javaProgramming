package superKeyword;

//Accessing Parent Class Methods.
//Accessing Parent Class Constructors
//Accessing Parent Class Variables

class Parent {
    int number = 10;

    Parent() {
        System.out.println("Parent constructor");
    }

    void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    int number = 20;

    Child() {
        super(); // Calls the constructor of the Parent class
        System.out.println("Child constructor");
    }

    void display() {
        System.out.println("Child display");
    }

    void show() {
        super.display(); // Calls the display method of the Parent class
        System.out.println("Child number: " + number);
        System.out.println("Parent number: " + super.number); // Refers to the number variable in the Parent class
    }
}


public class SuperAndCallToSuperUse {

	public static void main(String[] args) {
		Child child = new Child();
        child.show();

	}

}
