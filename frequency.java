package binary;

public class Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr [] = {1,1,2,2,4,5,5,6,6,6,6,9,10,11};
       int target=6;
     
       System.out.println(upper_boundary(arr,target));
       System.out.println(lower_boundary(arr,target));
       System.out.println(upper_boundary(arr,target)-lower_boundary(arr,target));
	}

	public static int lower_boundary(int[] arr, int target) {
      int low =0, high=arr.length-1;
		
		while(low<high) {
			int mid = low+(high-low)/2;
			
			if(target<=arr[mid])
				low = mid+1;
			else high =mid;
		}
		 
		 if(arr[low]!=target) return -1;
		 return low;
		
	}

	public static int upper_boundary(int[] arr, int target) {
       int low =0, high= arr.length-1;
		
		while(low<high) {
	  		int mid = low+(high-low)/2;
			
			if(target>=arr[mid])
				low= mid+1;
			else high = mid;
		}
		if(low<arr.length && arr[low]<=target) {
			low++;
			return -1;
		}
		
		return low-1;
		
	}
}