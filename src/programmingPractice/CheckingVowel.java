package programmingPractice;

import java.util.Scanner;

public class CheckingVowel {

	public static void main(String[] args) {
		
		int i=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=s.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E'||ch=='I'|| ch=='O'||ch=='U')
		{
		   System.out.println("vowel");
		}
		else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
		System.out.println("Consonant");
		}
		else
		{
			System.out.println("Not an alphabet");
		}
	
		}
	} 

//using method
/*import java.util.Scanner;
class Char
{
	void findVowelOrNot(char ch)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
		System.out.println("Entered character "+ch+" is  Vowel"); 
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			System.out.println("Entered character "+ch+" is Consonent");
		      else
			System.out.println("Not an alphabet");		
	}
	public static void main(String[ ] arg)
	{
		Char c=new Char();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character : ");
		char in=sc.next( ).charAt(0);	 		
		c.findVowelOrNot(in);
	}
} */

/*import java.util.Scanner;
class Char
{
	public static void main(String[ ] arg)
	{
	int i=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character : ");
	char ch=sc.next( ).charAt(0);	 
	//char ch=sc.nextChar();
	switch(ch)
	{
	 case  'a' :
	 case 'e'  :
	 case 'i'   :
	 case 'o'  :
	 case 'u'  :
	 case  'A' :
	 case 'E'  :
	 case 'I'   :
	 case 'O'  :
	 case 'U'  :i++;
	}
	if(i==1)
	System.out.println("Entered character "+ch+" is  Vowel");
	else 
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println("Entered character "+ch+" is Consonent");
		else
		System.out.println("Not an alphabet");		
	}
}
*/












