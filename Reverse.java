package pratices_prblms;

public class Reverse {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int p1 = arr1.length-1;
		int p2 = 0,temp;
		while(p1>=p2) {
			temp = arr1[p2];
			arr1[p2]=arr1[p1];
			arr1[p1]=temp;
			p2++;
			p1--;
		}
		for(p1= 0;p1<arr1.length;p1++) {
			System.out.println(arr1[p1]);
		}
		 //int n= arr1.length-1;
		//int[] arr2 = new int[arr1.length];
		//for(int i=n,j=0;i>=0;i--) {
			//arr2[j++] = arr1[i];
		//}
        //for(int i=0;i<=n;i++) {
        	//System.out.println(arr1[i]);
        	//}
	}

}
