package programmingPractice;

public class WithOutCollectionRemoveDuplicateAndPrintIntArrayAsItIs {

	public static void main(String[] args) {
		
		int [] arr= {1,2,7,2,3,4,5,7,1,2,3,4};
		for(int i=0;i<=arr.length-1;i++) {
			boolean isduplicate=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					isduplicate=true;
					break;
					}
			}
			if(!isduplicate) {
				System.out.print(arr[i]);
			}
		}
		
		
		
	}

}
