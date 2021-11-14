package dsa;

public class Vaild_anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s = "anagram";
      String t = "nagaram";
      char sArr[] = s.toCharArray()
    		  ;
     char tArr[] = t.toCharArray();
     System.out.println(check(sArr,tArr));
      
	}

	public static boolean check(char[] sArr, char[] tArr) {
		System.out.println(sort(sArr));
		System.out.println(sort(tArr));
		int n1 = sArr.length;
		int n2 = tArr.length;
		if(n1 != n2) return false;
		for(int i=1;i<n1;i++) {
			if(sArr[i] != tArr[i]) {
				return false;
			}
		}
		return true;
	}

	public static int sort(char[] arr) {
		int n = arr.length;
		for (int i=1; i<n; i++) {
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp) {
           	 arr[j+1] = arr[j];
           	 j = j -1;
            }
           arr[j+1] = (char) temp;
		}
		return 0;
	}
    
	

}
