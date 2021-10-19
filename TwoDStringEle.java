package pratices_prblms;

public class TwoDStringEle {

	public static void main(String[] args) {
		String arr[][] = {{"Devi","Harish","Kusuma"},{"Nagesh" ,"suji","Abhi"}};
		for(int i= 0 ; i<arr.length;i++) {
			for(int j= 0 ; j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
