package objectClass;

import java.util.Objects;

//To compare the content of objects, you need to override the equals() method in your class.

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

 // Overriding the equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

 // Overriding the hashCode() method (recommended when overriding equals)
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
    public class OverRidingEqualsMethod {

	public static void main(String[] args) {
		
		Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);
        Person person3 = new Person("Bob", 25);

        System.out.println(person1.equals(person2)); // true
        System.out.println(person1.equals(person3)); // false
		
		
		
		
		

	}

}
