package dsaprblm;

public class MiniElementArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int n= arr.length;
		System.out.println(find_minimum(arr,n));

	}

	public static int find_minimum(int[] arr, int n) {
		if(n==1)
		return arr[0];
		return Math.min(arr[n-1], find_minimum(arr,n-1));
	}

}
