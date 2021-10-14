package pratices_prblms;

public class CountPunctuationsInString {

	public static void main(String[] args) {
		String str = "He said,'the mailman loves you.'I heard it with my own ears.";
		str = str.toLowerCase();
		int count = 0;
		for(int i = 0; i<str.length();i++) {
			char newChar = str.charAt(i);
			if(!(newChar>='a' && newChar<='z')) {
				 boolean check = Character.isWhitespace(newChar);
				 if(!check) {
					 count++;
				 }
			}
		}
		System.out.print("Number of punctuations in a given string is "+ count);
	}


}
