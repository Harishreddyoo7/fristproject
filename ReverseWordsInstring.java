package pratices_prblms;

public class ReverseWordsInstring {

	public static void main(String[] args) {
		String s = "Java is better than python";
		String[] sArr = s.split(" ");
		String reverseString = "";
		for(int i = sArr.length-1; i>=0 ;i--) {
			reverseString = reverseString + " " + sArr[i] ;
		}
		System.out.println(reverseString);
	}
	

}
