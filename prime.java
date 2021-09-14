package findprime;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan = new Scanner(System.in) ;
		System.out.println("enter the number: ");
		n = scan.nextInt();
		int m = n/2;
		boolean flag = false;
		if(n==0|| n==1) {
			System.out.println("the number is not a prime");
		}
		else {
			for (int i =2; i <= m; i++); {
				if(n%1 == 0) {
					System.out.println("the number is not a prime");
				    flag = true;
				}
			}
		if(flag == false) {
			System.out.println("the number is a prime");
		}
		}
	}

}
