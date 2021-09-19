package com.geekster.demo.syntax;

import java.util.Scanner;

public class TypeCasting {
	public void casting() {
		int n;
		Scanner scan = new Scanner(System.in) ;
		System.out.println("enter the number: ");
		n = scan.nextInt();
		double m = n;
		System.out.println(m);
		scan.close();
	}

}
