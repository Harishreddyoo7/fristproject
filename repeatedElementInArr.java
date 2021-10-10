package pratices_prblms;

public class repeatedElementInArr {

	public static void main(String[] args) {
		int[] arr = {1,2,3,1,2,3};
		int k=3;
		boolean flag = false;
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]==arr[j]) && (Math.abs(i-j)<=k)) {
					System.out.println("true");
					flag = true;
					break;
				}
			}
			if(flag) {
				break;
			}
		}
		if(!flag) {
			System.out.println("False");
		}
	}

}
