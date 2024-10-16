package programmingPractice;

public class FindPrimeNosFromAnGivenArray {

	public static void main(String[] args) {

		int [] a= {2,9,5,10,6,3,7,11};
		
		for(int i=0;i<a.length;i++) {
			boolean flag=true;
			for(int n=2;n<a[i];n++) {
				if(a[i]%n==0) {
					flag=false;
					break;
					}
				}
			if(flag) {
				System.out.print(a[i]+",");
			}
			
			}
			
		}
		
	}
	
