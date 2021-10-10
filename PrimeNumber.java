package pratices_prblms;

public class PrimeNumber {

	public static void main(String[] args) {
		int StartingNum = 15, EndingNum =80, flag;
		for( int i=StartingNum; i <= EndingNum; i++) {
			flag =1;
			for(int j = 2;j<=i/2;j++) {
				if(i%j == 0) {
				  flag=0;
				  break;
				}
			}
		if(flag == 1) {
			System.out.println(i);
		}
		}	
	}

}
