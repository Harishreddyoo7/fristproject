package reverse;

import java.util.Scanner;

public class Reversing_number {

	public static void main(String[] args) {
		int n;
		int r = 0;
		Scanner scan = new Scanner(System.in) ;
		System.out.println("enter the number: ");
		n = scan.nextInt();
		while(n!=0) {
			int remainder = n%10;
			r = r * 10 + remainder;
			n = n/10;
			scan.close();
		}
		System.out.println("The reverse of the given number is:"+r);

	}

}
