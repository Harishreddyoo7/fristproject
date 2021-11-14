package binary;

public class binarys {
    
	public static int binary_s(int[] arr, int target) {
		int low=0;
		int high=arr.length-1;
		
		while(low<=high) {
			int mid = low+high/2;
			if (target==arr[mid]) {
				return mid;
			}else if (target<arr[mid]) {
				high = mid-1;
			}else 
				low =mid+1;
			}
			return -1;
		}
   public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7,8};
	int target = 6;
	  System.out.println(binary_s( arr,  target));
}  
	}


