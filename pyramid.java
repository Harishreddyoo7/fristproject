package com.geekster.demo.syntax;

import java.util.Scanner;

public class pyramid {
	public static void main(String[] args) {
	int n, i ,j ;
	Scanner scan = new Scanner(System.in) ;
	System.out.println("enter the number of rows: ");
	n = scan.nextInt();
	for (i=0; i<n; i++) {
		for(j=0 ; j<i+1 ; j++) {
			System.out.print("*");
			
		}
		System.out.println();
		scan.close();
	}
	}
		

}
