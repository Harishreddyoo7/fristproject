package pratices_prblms;

public class FindVowelsInString {

	public static void main(String[] args) {
		String str = "Hey!This is also,another simople question isn't it.";
		int i=0,vowels =0, consonant =0;
		str = str.toLowerCase();
		for(i = 0; i<str.length();i++) {
			char newChar = str.charAt(i);
			if(newChar>='a' && newChar<='z') {
				if(newChar == 'a' || newChar == 'e' || newChar == 'i' || newChar =='o'|| newChar =='u') {
					vowels++;
				}
				else {
					consonant++;
				}
			}
		}
		System.out.println("Number of vowels are " + vowels + " and number of consonant are " + consonant);
	}

}
