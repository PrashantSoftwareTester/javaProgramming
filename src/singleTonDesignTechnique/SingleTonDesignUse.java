package singleTonDesignTechnique;

//Singleton class
class Gmail {
	// Private static instance variable
	private static Gmail instance = null;

	// Private constructor to prevent instantiation from other classes
	private Gmail() {}

	// Public static method to provide access to the instance
	public static synchronized Gmail getInstance() {
		if (instance == null) {
			instance = new Gmail();
		}
		return instance;
	}
}

//Main class to demonstrate the Singleton pattern
public class SingleTonDesignUse {

	public static void main(String[] args) {

		// Accessing the Singleton instance
		Gmail gmailInstance1 = Gmail.getInstance();
		Gmail gmailInstance2 = Gmail.getInstance();

		// Printing the instances to show they are the same
		System.out.println(gmailInstance1);
		System.out.println(gmailInstance2);

		// Verifying both references point to the same instance
		System.out.println(gmailInstance1 == gmailInstance2); // Output: true

	}

}
