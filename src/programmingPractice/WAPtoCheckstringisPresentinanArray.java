package programmingPractice;

public class WAPtoCheckstringisPresentinanArray {

	public static void main(String[] args) {

		String [] arr= {"Rajkumar","akshaykumar","ranveersingh","prashantsingh","srisingh"};
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i].contains("singh")) {
				System.out.println(arr[i]);	
			}
       }
   }

}
