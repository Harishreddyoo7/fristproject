package pratices_prblms;

public class mergeTwoArray {

	public static void main(String[] args) {
		int[] arr1 = {4,5,6,7,8};
		int[] arr2 = {1,2,3,4};
		int a1 = arr1.length;
		int a2 = arr2.length;
		int n = a1+a2;
		int[] arr = new int[n];
		for(int i=0;i<a2;i++) {
			arr[i]=arr2[i];
		}
		for(int i=0;i<a1;i++) {
			arr[a2+i]=arr1[i];
		}
        for(int i=0;i<n;i++) {
        	System.out.println(arr[i]);
        }
	}

}
