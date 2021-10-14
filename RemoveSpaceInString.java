package pratices_prblms;

public class RemoveSpaceInString {

	public static void main(String[] args) {
		String str = "This is very simple question.";
		 for(int i = 0; i<str.length();i++) {
			 char newChar = str.charAt(i);
			 boolean check = Character.isWhitespace(newChar);
			 if(!check) {
				 System.out.print(newChar);
			 }
		 }
	}

}
