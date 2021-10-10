package pratices_prblms;

public class AlphaNumeric {
	public static Boolean isAlphaNumeric(String str) {
		for(int i =0; i<str.length();i++) {
			char c = str.charAt(i);//{A,b,d,1,2,3,@}
			if(!(c>='A' && c<='Z') &&!(c>='a'&&c<='z') && !(c>='0' && c<='9')) {
				return Boolean.FALSE;
			}
		}
		return Boolean.TRUE;
	}
		public static void main(String[] args) {
			String str= "Abd123";
	
		    System.out.println("is alphaNumeric " + isAlphaNumeric(str));
	}

}
