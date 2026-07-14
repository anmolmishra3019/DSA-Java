import java.util.*;

public class Main {

	public static void main(String[]args) {
		int a[]= {7,1,5,3,6,4};
		int bestBuy=a[0];
		int profit=0;
		int maxprofit=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<bestBuy) {
				bestBuy=a[i];
			}
			profit=a[i]-bestBuy;
			/* System.out.println("best buy at"+a[i]+"is"+bestBuy);
			 System.out.println("profit at"+a[i]+"is"+profit);*/
			if(profit>maxprofit) {
				maxprofit=profit;
			}
		}
	}
}