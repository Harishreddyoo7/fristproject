package pratices_prblms;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int row = scan.nextInt();
		System.out.println("Enter number of column:");
		int col = scan.nextInt();
		int[][] arr = new int[row][col];
		System.out.println("Enter the array elements:");
		for(int i= 0 ; i<row;i++) {
			for(int j= 0 ; j<col;j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i= 0 ; i<row;i++) {
			for(int j= 0 ; j<col;j++) {
				if((i+j)%2==0) {
					arr[i][j] = 0;
				}
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		scan.close();
	}

}
