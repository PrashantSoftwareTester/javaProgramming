package programmingPractice;

public class SortStringArray {

	public static void main(String[] args) {

		String [] arr= {"hydrabad","chennai","bangalore","mumbai","delhi","kolkata"};
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}

		}

		for(String x:arr) {
			System.out.println(x);
		}






	}

}
