package StaticAndNonStatic;

public class StaticKeyWord {

	static int i=10;        //Global Static Variable.
	int j=20;               //Global Non-Static Variable.

	public static void main(String[] args) {

		int i=100;                  //Local Variable
		System.out.println(StaticKeyWord.i);
		System.out.println(i);

		int j=200;
		StaticKeyWord scn=new StaticKeyWord();
		System.out.println(scn.j);
		System.out.println(j);

	}

}
