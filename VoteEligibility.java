package pratices_prblms;

import java.util.Scanner;

public class VoteEligibility {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age of the person:");
		int age = scan.nextInt();
		validateAge(age);
		scan.close();

	}
	public static void validateAge(int age) {
		boolean flag=false;
		if(age>18) {
			//System.out.println("The person is eligible for vote");
			flag = true;
		}
		if(flag==true)
			System.out.println(flag);
		else 
			System.out.println(flag);
	}

}
