package pratices_prblms;

public class SplitRegEx {

	public static void main(String[] args) {
		String str = "hello;world";
		String str1[] = str.split(";");
		for(int i = 0;i<str1.length;i++)
			System.out.println(str1[i]);

	}

}
