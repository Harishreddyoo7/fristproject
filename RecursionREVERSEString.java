package dsaprblm;

public class RecursionREVERSEString {

	public static void main(String[] args) {
		String str = "Harish";
		char strArr[]=str.toCharArray();
		reverse(strArr,0);

	}

	public static void reverse(char[] strArr, int k) {
		if(k==strArr.length) {
			return;
		}
		reverse(strArr,k+1);
		System.out.println(strArr[k]);
	}

}
