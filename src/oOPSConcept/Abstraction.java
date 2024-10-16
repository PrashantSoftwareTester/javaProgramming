package oOPSConcept;

abstract class Atmcard{

	abstract void pin(int number);
}

class Atmmachine extends Atmcard {

	public void pin(int number) {
		System.out.println("pin method completed"+number);
	}
}

public class Abstraction {

	public static void main(String[] args) {

		Atmmachine card1=new Atmmachine();
		card1.pin(123);

		Atmcard card2=new Atmmachine();
		card2.pin(235);




	}

}
