package dsa;

import java.util.Arrays;

public class Contains_duplicate {

	public static void main(String[] args) {
		int arr[]= {1,2,3,3};
		Arrays.sort(arr);
		int flag = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					flag =1;
					
				}
			}
			if(flag==0) ;
		}
     if(flag==0)
    	 System.out.println(false);
     else
    	 System.out.println(true);
	}

}
