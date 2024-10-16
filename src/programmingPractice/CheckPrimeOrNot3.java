package programmingPractice;

import java.util.Scanner;

public class CheckPrimeOrNot3 {

	public static void main(String[] args) {
		String yn;
	    do{Scanner scn=new Scanner(System.in);
	    System.out.println("Enter a number");
	    int n=scn.nextInt();
	    boolean flag=true;
	    for(int i=2;i<=n-1;i++) {
	    	if(n%i==0) {
	    		flag=false;
	    		break;
	    	}
	    }
	    if(flag) {
	    	System.out.println("n is a prime number");
	    }else {
	    	System.out.println("n is not a prime no");
	    }
	    
	    System.out.println("If you want to proceed then press Y or else N to discontinue");
	     yn=scn.next();
	    }while(yn.equals("Y") || yn.equals("y"));

		
		

	}

}
