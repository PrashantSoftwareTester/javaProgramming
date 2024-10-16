package constructorpractice;

public class CopyConstructor {

	int x;
	int y;

	CopyConstructor(CopyConstructor dem1)
	{
		x=dem1.x;
		y=dem1.y;
	}

	CopyConstructor(int v1,int v2)
	{
		x=v1;
		y=v2;
	}

	public static void main(String[] args) {

		CopyConstructor dem1=new CopyConstructor(10,20);

		System.out.println(dem1.x);
		System.out.println(dem1.y);

		CopyConstructor dem2=new CopyConstructor(dem1);

		System.out.println(dem2.x);

		System.out.println(dem2.y);






	}

}
