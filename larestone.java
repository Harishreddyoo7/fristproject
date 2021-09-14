package largestofnumbers;

import java.util.Scanner;

public class larestone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n ;
		
		Scanner scan = new Scanner(System.in) ;
		System.out.println("enter number of elements: ");
		n = scan.nextInt();
		int[] arr = new int[n];
		int lar = arr[0];
		System.out.println("enter elements: ");
		for(int i=0 ;i < arr.length;i++) {
			arr[i] = scan.nextInt();
			if(arr[i]>lar)
				lar = arr[i] ;
				
		}
      System.out.println("the largest number in an array is " +lar);
	}

}
