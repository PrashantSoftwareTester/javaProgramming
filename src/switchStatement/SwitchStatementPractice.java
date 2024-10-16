package switchStatement;
import java.util.Scanner;
// WAP to print season of a month
public class SwitchStatementPractice {
public static void main(String[] args) {
		String yn;
        do{Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Month No.");
		int month=scn.nextInt();
		switch(month){
		case 1:System.out.println("January");break;
		case 2:case 3:case 4:System.out.println("February  March  April");break;
		case 5:System.out.println("May");break;
		case 6:System.out.println("June");break;
		case 7:System.out.println("July");break;
		case 8:System.out.println("August");break;
		case 9:System.out.println("Sept");break;
		case 10:System.out.println("Oct");break;
		case 11:System.out.println("Nov");break;
		case 12:System.out.println("Dec");break;
		default:System.out.println("invalid month");
        }
		System.out.println("Please Enter y to continue and any other key to discontinue");
		yn=scn.next();
		} while (yn.equals("Y")||yn.equals("y"));


	}
}	










