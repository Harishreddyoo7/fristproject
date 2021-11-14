package dsa;

public class SortASentence {

	public static void main(String[] args) {
		String s = "sentence4 a3 is2 this1";
		String str[]= s.split(" ");
		int n = str.length;
		String sort[]=new String[n];
		for(int i=0;i<n;i++) {
			String k = str[i];
			int n1=k.length();
			char ch = k.charAt(n1-1);
			int x = Character.getNumericValue(ch);
			String append = k.substring(0,n1-1);
			sort[x-1] = append;
		}
    String sort1 = " ";
    for(int i=0;i<sort.length;i++) {
    	sort1 = sort1+sort[i]+ " " ;
    }
    System.out.println(sort1.substring(0,sort1.length()-1));
	}

}
