import java.util.*;
public class Main
{
	public static void maxSubarraySum(int a[]) {
		int curSum=0;
		int maxSum=Integer.MIN_VALUE;;
		for (int i=0; i<a.length ; i++ ) {
			for (int j=i; j<a.length; j++) {
				curSum=0;
				for (int k=i; k<=j; k++) {

					curSum=curSum+a[k];
					
				}
				if(curSum>maxSum) {
					maxSum=curSum;
					System.out.println(maxSum);
				}


			}


		}
		System.out.println("maxSum is:"+maxSum);
	}
	public static void main(String[] args) {
		int a[]= { 1,-6,3,-4,5};
		maxSubarraySum(a);
	}
}