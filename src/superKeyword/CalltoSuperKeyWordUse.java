package superKeyword;

class Dosa{

	Dosa(){
		System.out.println("Inside the constructor of Dosa");
	}

	Dosa(int i){
		System.out.println("One agrumented Dosa Constructor");
	}
}

class MasalaDosa extends Dosa{

	MasalaDosa(){
		super(10);	 //call to super.
		System.out.println("Inside the constructor of MasalaDosa");
	}

	MasalaDosa(int j){
		super();  //call to super.
		System.out.println("One argumented MasalaDosa Constructor");
	}

}

public class CalltoSuperKeyWordUse {

	public static void main(String[] args) {
         
       MasalaDosa obj1=new MasalaDosa();
       System.out.println(obj1);

       MasalaDosa obj2=new MasalaDosa(10);
       System.out.println(obj2);






	}

}
