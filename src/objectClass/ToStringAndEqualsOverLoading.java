package objectClass;

class God{

	String name="jimmy";

	God(String name){
		this.name=name;
	}

	public boolean equals(Object obj) {

		return this.name.equals(((God)obj).name);

	}
}
public class ToStringAndEqualsOverLoading {

	public static void main(String[] args) {

		God d1=new God("jimmy");

		God d2=new God("Tommy");

		System.out.println(d1.equals(d2));

		System.out.println(d1==d2);

	}

}
