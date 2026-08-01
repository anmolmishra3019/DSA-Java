import java.util.*;
class productExceptSelf {

	public static int[] ProductExceptSelf(int a[]) {
		int n= a.length;

		int left[]=new int[n];
		int right[]= new int[n];
		int answer[]= new int[n];

		left[0]=1;
		for(int i=1; i<n; i++) {
			left[i]=left[i-1]*a[i-1];
		}

		right[n-1]=1;
		for(int i=n-2; i>=0; i--) {
			right[i]=right[i+1]*a[i+1];
		}

		for (int i=0; i<n ; i++ ) {
			answer[i]=right[i]*left[i];
		}
		return answer;
	}

	public static void main (String[] args) {
		int  a[]= {1,2,3,4,5};
		int answer[]= ProductExceptSelf(a);
		System.out.println(Arrays.toString(answer));
	}
}