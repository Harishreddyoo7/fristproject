package dsaprblm;

public class Recursioncheck {

	public static boolean check(int arr[],int index) {
		if (index== arr.length-1)return true;
		if(arr[index]<arr[index+1]) {
			return check(arr,index+1);
		}
		return false;

	}
    public static void main(String[] args) {
    	int arr[] = {1,2,3,7};
    	int index =0;
    	System.out.println(check(arr,index+1));
    }
}
