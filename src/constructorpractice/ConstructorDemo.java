package constructorpractice;

public class ConstructorDemo {
	int x;
	int y;
	int z;

	ConstructorDemo(int v1,int v2,int z)
	{
		this.x=v1;
		y=v2;
		this.z=z;     //if we put z=z, then it will print default value of int z , i,e zero.
	}
	public static void main(String[] args) {

		ConstructorDemo dem1=new ConstructorDemo(10,20,30);
		
		System.out.println(dem1.x);
		System.out.println(dem1.y);
		System.out.println(dem1.z);


	}

}
