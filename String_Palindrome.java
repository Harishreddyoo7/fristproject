package palindrome;

import java.util.Scanner;

public class String_Palindrome {

	public static void main(String[] args) {

     String name, rev ="";
		
		Scanner scan = new Scanner(System.in) ;
		System.out.println("enter the name: ");
		name = scan.nextLine();
		char[] temp = name.toCharArray();
		for (int i=temp.length-1 ; i>=0; i--) {
			 rev = rev + temp[i];
		}
		if(name.equals(rev)) {
			System.out.println("Given string is palindrome.");
		}
		else {
			System.out.println("Given string is not a palindrome.");
		}
         scan.close();
	}

}
