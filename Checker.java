package pratices_prblms;

import java.util.Scanner;

public class Checker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of number");
		int num = scan.nextInt();
        check(num);
        scan.close();
	}
public static  void check(int num) {
	if(num<=100) {
		System.out.println("the given number is less than 100");
		if(num>=50) {
			System.out.println("the given number is greater than 50");
		}
		else {
			System.out.println("the given number is less than 50");
		}
	}
	else {
		System.out.println("the given number is greater than 100");
		if(num>=150) {
			System.out.println("the given number is greater than 150");
		}
		else {
			System.out.println("the given number is less than 150");
		}
	}
}
}
