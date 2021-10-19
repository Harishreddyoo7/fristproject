package pratices_prblms;

public class Sum2ColEqualto3rd {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{9,10,2},{1,2,4}};
		int sum=0;
		for(int i= 0 ; i<arr.length;i++) {
			for(int j= 0 ; j<arr[i].length;j++) {
				if(j<2) {
					sum = sum + arr[i][j];
				}
			}
				if(sum == arr[i][2]) {
					System.out.println("True");
				}
				else {
					System.out.println("False");
				}
				sum = 0;
		}
	}

}
