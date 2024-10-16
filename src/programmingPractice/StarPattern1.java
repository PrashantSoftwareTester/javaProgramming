package programmingPractice;

import java.util.Scanner;

//1.          2.     *****   3. 1       4. 1      5. 2        6.  12345  7. 11111 8. 23456  9. 55555
//   *               ****       22         12        34           1234      2222     3456      4444
//   **              ***        333        123       456          123       333      456       333
//   ***             **         4444       1234      5678         12        44       56        22
//   ****            *          55555      12345     678910       1         5        6         1
//   *****



//1st Pattern

public class StarPattern1 {
   
  public static void main(String[] args) {
   int n,i,j,k;
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the No");
   n=s.nextInt();
  /* for(i=1;i<=n;i++)
   {
	 for(j=1;j<=i;j++)
	 {
		System.out.print("*"); 
	 }
      System.out.println();
   } */

 // System.out.println("2nd type");	
   
  /* for(i=1;i<=n;i++)
   {
	 for( j=n;j>=i;j--)
	 {
		System.out.print("*"); 
	 }
      System.out.println("");
   } */
   
//   Or: 
   
  /* for(;n>=1;n--)
   {
	   for(j=1;j<=n;j++)
	   {
		  System.out.print("*"); 
	   }
	   
	   System.out.println();
   }*/
   
   

  
 //2nd Pattern
 //*
 //**
 //***  
 //****  
 //***  
 //**  
 //*  
 
	 /* for(int i=1;i<=4;i++)
	   {
		 for(int j=1;j<=i;j++)
		 {
			System.out.print("*"); 
		 }
	      System.out.println("");
	   }
		
	   for(int i=1;i<=4;i++)
	   {
		 for(int j=3;j>=i;j--)
		 {
			System.out.print("*"); 
		 }
	      System.out.println("");
	   }*/
	
//3rd Pattern

//   *     2.    1  3.        1     4.        2
//	**          12           22              34 
// ***	       123          333             456 
//****        1234         4444            5678 
//                                        678910    
 /*for(int i=1;i<=4;i++)	  
{
 for(int j=4;j>=i;j--)
 {
  System.out.print(" ");	 
 }
 for(int k=1;k<=i;k++)
 {
  System.out.print("*");	 
 }
 System.out.println();	
}*/
  ////4th Pattern
	  
//  ****       2. 12345    3. 11111   4. 55555
//   ***           1234        2222       4444 
//    **            123         333        333
//     *             12          44         22
//                    1           5          1
   
 /*for( i=1;i<=4;i++)	  
 {
  for( j=1;j<=i;j++)
  {
   System.out.print(" ");	  
  }
  for( k=4;k>=i;k--)	 
  {
   System.out.print("*");	  
  }
  System.out.println();	 
	 
}*/
   
 // Or
   
  /* for(i=1;i<=n;i++)
   {
	   for(j=1;j<i;j++)
	   {
		   System.out.print(" ");
	   }
	   for(k=1;k<=n+1-i;k++)
	   {
		   System.out.print("*");
	   }
		   
	   System.out.println();
   } */
   
   
//5th Pattern
	  
//    *   
//   **
//  *** 
// ****  
//*****   
// ****
//  ***
//   **
//    *
/* for(int i=1;i<=5;i++)
 {
   for(int j=4;j>=i;j--)	 
   {
	 System.out.print(" ");  
   }
   for(int k=1;k<=i;k++)
   {
	 System.out.print("*");  
   }
   System.out.println();
}
   
for(int i=1;i<=5;i++)   
{
  for(int j=1;j<=i;j++)
  {
   System.out.print(" ");	  
  }
  for(int k=4;k>=i;k--)	
  {
	System.out.print("*");  
  }
  System.out.println();	
	
}*/

//6th Pattern 1st method
/*       *
	    * *
	   * * *
	  * * * *        
   
for(int i=1;i<=4;i++)
{
  for(int j=4;j>=i;j--)	
  {
   System.out.print(" ");	    
  }
  for(int k=1;k<=i;k++)
  {
   System.out.print(" *");	  
  }
System.out.println();	  
} */
	  
	 //6th Pattern 2nd method
/*  for(int i=1;i<=4;i++)
  {
	 for(int j=4;j>=1;j--) 
	 {
	  if(j>i)
	  {
		 System.out.print(" "); 
	  }
	  else
	  {
		System.out.print(" *");  
	  }
	}
  
  System.out.println();
  
  }    */
	
// 7th Pattern method 1
//      *             2.           1         3.             1
//	   ***                        123                      222
//	  *****                      12345                    33333
//	 *******                    1234567                  4444444
//                             123456789                555555555
   
/*for(int i=1;i<=4;i++)
{
  for(int j=4;j>=i;j--)	
  {
	 System.out.print(" ");  
  }
  for(int k=1;k<=i;k++)
  {
	System.out.print("*");  
  }

  for(int l=2;l<=i;l++)
  {
	System.out.print("*");   
  }
System.out.println();

} */
	  
/*7th Pattern method 2  
for(int i=1;i<=4;i++)
{
  for(int j=4;j>=i;j--)	
  {
	 System.out.print(" ");  
  }
  for(int k=1;k<(i*2);k++)
  {
	System.out.print("*");  
  }
System.out.println();
} */
  
//8th Pattern method  1
/*	  *******       2.   1234567   3.   1111111   4.  555555555
	   *****              12345          22222         4444444
	    ***                123            333           33333
	     *    */      //    1              4             222
/*for(int i=1;i<=4;i++)                           //      1
{
 for(int j=1;j<=i;j++) 
 {
  System.out.print(" ");	 
 }
 for(int k=4;k>=i;k--)	
 {
  System.out.print("*");	 
 }
 for(int l=3;l>=i;l--)	
 {
  System.out.print("*");	 
 }
System.out.println();	
} */

   
   //8th Pattern method  2
/*for(int i=1;i<=4;i++)
{
 for(int j=1;j<=i;j++) 
 {
  System.out.print(" ");	 
 }
 for(int k=9;k>(i*2);k--)	
 {
  System.out.print("*");	 
 }
 
System.out.println();	
}  */ 
   
	//8th Pattern method  3
/* for(int i=5;i>=1;i--)
 {
  for(int j=5;j>i;j--)	 
  {
	System.out.print(" ");  
  }
 for(int k=1;k<(i*2);k++)
 {
	 System.out.print("*");
 }
	 System.out.println();
 } */
//9th Pattern method  
//   *
//	  *
//	   *
//	    *
	 	  
 /* for(int i=1;i<=4;i++)   
{
  for(int j=1;j<=i;j++)	
  {
    if(i>=2 && j<=i-1)
    {
     System.out.print(" ");	
    }
    else
    {
      System.out.print("*");	
    }
   }
   
   System.out.println();
} */

//       *
//      * 
//     *  
//    *   

 /* for(int i=1;i<=4;i++)   
{
  for(int j=4;j>i;j--)
  {
	  System.out.print(" ");
  }
	for (int k=1;k<=i;k++)  
  {
    if(i>=2 && k>1)
    {
     System.out.print(" ");	
    }
    else
    {
      System.out.print("*");	
    }
   }
   
   System.out.println();
} */
  
//10th Pattern method 
//	 *       *
//	  *     *
//	   *   *
//	    * *
//	     *
	  
  
/*for(int i=5;i>=1;i--)  
{
  for(int j=5;j>i;j--)
  {
	System.out.print(" ");  
  }
  for(int k=1;k<(i*2);k++)	
  {
	if(k>1 && k<(i*2)-1)
	{
	  System.out.print(" ");	
	}
	else
	{
	 System.out.print("*");	
	}
		
  }
System.out.println();  	

} */
  
//       *
//      * *  
//     *   *
//    *     *
//   *       *

 /*for(int i=1;i<=5;i++)
{
 for(int k=5;k>=i;k--)
 {
  System.out.print(" ");	 
 }
for(int j=1;j<(i*2);j++)
{
  if(j>1 && j<(i*2)-1) 
  {
	System.out.print(" ");
  }	
  else
  {
	System.out.print("*");  
  }
}
 System.out.println();
 } */
 
//11th Pattern method 
//	 *   *
//	  * * 
//	   *  
//	  * * 
//	 *   *  

/* for(int i=0;i<5;i++) 
 {	 
   for (int j=0;j<5;j++)
   {
	if(i==j || i+j==5-1)   
	{
	 System.out.print("*");	
	}
	else
	{
	 System.out.print(" ");	
	}
  }
  System.out.println();
   
 } */

//12th Pattern method
/*	  *****
	  *****
	  *****
	  *****
	  *****     */
/* for(int i =1;i<=5;i++)
{
  for(int j=1;j<=5;j++)
  {
	 System.out.print("*"); 
  }
	
	System.out.println();
} */
	  
	//13th Pattern method	  
//	  *****
//	  *   *
//	  *   *
//	  *   *
//	  *****

/* for(int i =1;i<=5;i++)
{
  for(int j=1;j<=5;j++)
  {
	 if(i>=2 && j>=2 && i<=4 && j<=4)
	 {
		 System.out.print(" ");
	 }
	 else
	 {
		 System.out.print("*");
	 }
 }
	
	System.out.println();
 }  */


//14th Pattern
   
/*           *
            ***
           ***** 
          *******
         *********
          *******
           *****
            ***
             *          */ 
   






	  
	  
	  
	  
	
   
   
   
	  
	  
  }

}
