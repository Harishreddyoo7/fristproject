package pratices_prblms;

public class ReverseCharInString {

	public static void main(String[] args) {
		String s = "Java is better than python";
		String[] sArr = s.split(" ");
		String reverseString = "";
		for(int i = 0; i<sArr.length;i++) {
			String reversedstr = reverseString(sArr[i]);
			reverseString = reverseString + " " + reversedstr;
			
		}
		System.out.println(reverseString);
	}
	public static String reverseString(String s) {
		String reverseStr = "";
		for(int i = s.length()-1;i>=0; i--) {
			char newChar = s.charAt(i);
			reverseStr = reverseStr +newChar;
		}
		return reverseStr;
		
	}

}
