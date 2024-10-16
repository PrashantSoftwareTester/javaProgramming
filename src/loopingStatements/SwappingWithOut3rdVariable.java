package loopingStatements;

public class SwappingWithOut3rdVariable {

	public static void main(String[] args) {
	
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Value of a after swapping is a="+a);
		System.out.println("Value of b after swapping is b="+b);
		
		
		
		

	}

}
