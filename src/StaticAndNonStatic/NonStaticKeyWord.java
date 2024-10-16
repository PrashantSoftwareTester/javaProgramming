package StaticAndNonStatic;

public class NonStaticKeyWord {

	int j=20;  //Global Non-Static Variable.
    
	public static void main(String[] args) {

		int j=200; // Local Non-Static Variable.
		NonStaticKeyWord scn=new NonStaticKeyWord();
		System.out.println(scn.j);
		System.out.println(j);

	}

}
