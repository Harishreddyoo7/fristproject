package pratices_prblms;

public class ArrayDiagonalEleCheck {

	public static void main(String[] args) {
		int[][] arr = {{0,0,0},{1,0,1},{0,0,1}};
		int ans=0;
		boolean flag = false;
		for(int i= 0 ; i<arr.length;i++) {
			for(int j= 0 ; j<arr[i].length;j++) {
				if(i == j) {
					if(ans == arr[i][j])
						flag = true;
					else {
						flag = false;
						System.out.println("False");
						break;
					}
				}
			}
			if(!flag) {
				break;
			}
		
		}
		if(flag) {
			System.out.println("True");
		}

	}

}
