package dsa;

public class FirstAndLastOccurence {

	public static void main(String[] args) {
		String str = "abca";
		int index =0;
		charoccurance(str,index+1);
	}
     static int first =-1;
     static int last =-1;
	 static void charoccurance(String str, int index) {
		if(index == str.length()) {
			System.out.println(first + " " + last);
			return;
		}
		if(str.charAt(index)=='a') {
			if(first ==-1) {
				first = index;
			}
			else last = index;
		}
		charoccurance(str,index+1);
	}

}
