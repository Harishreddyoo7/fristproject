package sumofnumbers;

import java.util.Scanner;

public class sumofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,sum=0 ;
		
		Scanner scan = new Scanner(System.in) ;
		System.out.println("enter number of elements: ");
		n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("enter elements: ");
		for(int i=0 ;i < arr.length;i++) {
			arr[i] = scan.nextInt();
			sum = sum+arr[i];
		}
		
		System.out.println("sum of elements: "+sum);
	}

}
