package dsa;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {2,5,1,0,8,3};
     int n = arr.length;
     boolean swapped = false;
     for(int i=0;i<n;i++) {
    	 swapped = false;
    	 for(int j=0;j<n-1;j++) {
    		 if(arr[j]>arr[j+1]) {
    			 int temp = arr[j];
    			 arr[j] = arr[j+1];
    			 arr[j+1]= temp;
    			 swapped = true;
    		 }
    	 }
    	 if(swapped == false) break;
     }
     for(int i=0;i<n;i++) {
    	 System.out.println( arr[i] + " ");
     }
	}

}
