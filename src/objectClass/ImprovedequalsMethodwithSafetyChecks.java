package objectClass;

class Ggod {
    String name = "jimmy";
    
    Ggod(String name) {
        this.name = name;
    }
    
 // Overriding the equals() method with safety checks
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if both references are the same
        if (obj == null || getClass() != obj.getClass()) return false; // Check for null and class type
        Ggod god = (Ggod) obj; // Cast to God
        return name.equals(god.name); // Compare name fields
    }
}


public class ImprovedequalsMethodwithSafetyChecks {

	public static void main(String[] args) {
		
		Ggod d1 = new Ggod("jimmy");
		Ggod d2 = new Ggod("Tommy");
	        
	        System.out.println(d1.equals(d2)); // Output: false
	        System.out.println(d1 == d2); // Output: false
		
		
		
		
		

	}

}
