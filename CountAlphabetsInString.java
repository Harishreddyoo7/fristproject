package pratices_prblms;

public class CountAlphabetsInString {

	public static void main(String[] args) {
		String str = "The best of both worlds.";
		str = str.toLowerCase();
		int count = 0;
		for(int i = 0; i<str.length();i++) {
			char newChar = str.charAt(i);
			if(newChar>='a' && newChar<='z') {
				count++;
			}
		}
		System.out.print("Number of alphabets in a given string is "+ count);
	}

}
