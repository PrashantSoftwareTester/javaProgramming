package programmingPractice;

public class FindMultipleCharacterCount {

	public static void main(String[] args) {

		String str="bangalore";
		while(str!="") {
			int srch=0;

			String ch=Character.toString(str.charAt(0));

			int count=0;
			while(str.indexOf(ch,srch)!=-1) {
				count++;
				srch=str.indexOf(ch,srch)+1;
			}
			System.out.println(ch+":"+count);
			str=str.replaceAll(ch, "");
		}
	}	

}






