package pratices_prblms;

public class BestTimeToBuyAndSell {

	public static void main(String[] args) {
		int[] prices = {7,6,4,3,1};
		int length = prices.length-1;
		int m = 0;
		for(int x =length;x>0;x--) {
			m = m + x ;
		}
		int[] profit = new int[m];
		int k =0;
		for(int i = 0;i<prices.length; i++) {
			for(int j=i+1;j<prices.length;j++) {
				profit[k++] = prices[j]-prices[i];
			}
		}
		int max = 0;
	    for(k=0;k<m;k++) {
	    	if(profit[k]>max)
	    		max = profit[k];
	    		
	    }
	    //if(max<0)
	    	//max =0;
	    System.out.println(max);
	}

}
