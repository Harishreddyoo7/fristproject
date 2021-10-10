package pratices_prblms;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] arr = {1,2,3,9,7,6,5};
		int[] arrCopy = new int[arr.length];
		for(int i=0; i<arr.length;i++) {
			arrCopy[i] =  arr[i];
		}
	    for(int i=0; i<arr.length;i++) {  
	           	 System.out.println(arrCopy[i]);
			}
		}

	}


