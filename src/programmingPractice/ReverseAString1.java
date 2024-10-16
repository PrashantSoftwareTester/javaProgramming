package programmingPractice;

public class ReverseAString1 {

	public static void main(String[] args) {
     
	String name="prashant";
	String rev="";
    int len=name.length();
    for(int i=len-1;i>=0;i--)
    {
    	rev=rev+name.charAt(i);
    }
    System.out.println("Reverse of "+name+" is "+rev);
    
	}

}
