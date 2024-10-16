package programmingPractice;

import java.util.Scanner;

public class CreateCalculatorSwitchcase {

	public static void main(String[] args) {
        String yn;
		do {
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter first no");
	int No1=s.nextInt();
	System.out.println("Enter Second no");
	int No2=s.nextInt();	
	System.out.println("Select symbol(+,-,*,/)");	
	String Symbol=s.next();
	int res;
	
	switch(Symbol)
	{
	case "+":res=No1+No2;System.out.println("Addition is: "+res);break;
	case "-":res=No1-No2;System.out.println("Addition is: "+res);break;
	case "*":res=No1*No2;System.out.println("Addition is: "+res);break;
	case "/":res=No1/No2;System.out.println("Addition is: "+res);break;
	default :System.out.println("Invalid Symbol");break;
	
	}
	
	System.out.println("Do you want to continue(Press y for Yes and n for No)");
	yn=s.next();
	
	
		}while(yn.equals("y") || yn.equals("Y"));	
		
		
		
	
	}

}
