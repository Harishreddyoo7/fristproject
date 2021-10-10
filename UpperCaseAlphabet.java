package pratices_prblms;

public class UpperCaseAlphabet {

	public static void main(String[] args) {
		String alphaNumeric = "abc1234";
		char[] array = alphaNumeric.toCharArray();
		for(int i=0;i<array.length;i++) {
			if(array[i]>='a' && array[i]<='z') {
			    array[i] = Character.toUpperCase(array[i]);
			}
		}
		alphaNumeric = String.copyValueOf(array);
		System.out.println(alphaNumeric);

	}

}
