package pratices_prblms;

public class AvgofArrEle {

	public static void main(String[] args) {
		int[] arr = {1,2,3,5,9,14,19,4,6};  
		int n=arr.length;
		double avg= 0,sum=0;
		for(int i=0; i<n ;i++) {
			sum = sum+arr[i];
			avg = sum/n;
		}
		System.out.println(avg);

	}

}
