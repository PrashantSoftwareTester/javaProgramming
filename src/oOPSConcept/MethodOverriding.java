package oOPSConcept;

class Mobile{
	void call() {
		System.out.println("Mobile Call");
	}

	void sms() {
		System.out.println("Mobile sms");
	}
}

class Samsung extends Mobile{

	void android() {
		System.out.println("Android version lolipop");
	}

	void call() {
		System.out.println("Samsung Call");
	}

}

class Apple extends Mobile{

	void ios() {
		System.out.println("ios version 10");
	}

	void sms() {
		System.out.println("iphone sms");
	}

}

public class MethodOverriding {

	public static void main(String[] args) {

		Apple obj1=new Apple();
		obj1.call();
		obj1.ios();
		obj1.sms();





	}

}
