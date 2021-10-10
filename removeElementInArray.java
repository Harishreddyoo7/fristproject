package pratices_prblms;

public class removeElementInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,9,7,6,5};
		int k=9;
		int[] arrNew = new int[arr.length-1];
		for(int i=0,j=0; i<arr.length;i++) {
			if(arr[i]==k) {
				continue;
			}
			arrNew[j++] =  arr[i];
		}
	    for(int j=0; j<arr.length-1;j++) {  
	           	 System.out.println(arrNew[j]);
			}
		
	}

}
