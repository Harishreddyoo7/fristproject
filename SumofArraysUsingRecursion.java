package dsaprblm;

public class SumofArraysUsingRecursion {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,10};
		System.out.println(sum(arr,arr.length));

	}

	public static int sum(int[] arr, int k) {
		if(k<=0) {
			return 0;
		}
		return (sum(arr,k-1)+arr[k-1]);
	}

}
