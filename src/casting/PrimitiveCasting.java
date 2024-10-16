package casting;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
//Widening or Auto-Widening;
		
		int i=10;
		double d=i;
		
		System.out.println(d);
		
		
//Narrowing or Explict-Narrowing:
		
		double c=20.025;
		int e= (int)c;  
		System.out.println(e);
		
//Data Types in ascending orders
		
System.out.println("Hello");
		
		boolean g=true;
		byte a=127;
		short b=32767;
		char h='a';
	//	int c=2147483647;
	//	float e=1.2365488F;
	//	long d=9223372036854775807L;
		double f=1.215469874;
		
		float z=(float) f;
		System.out.println(z);
		
		
		

	}

}
