import java.util.*;

class Main {
	public static int[] twoSum(int a[], int k) {
		HashMap<Integer,Integer> store=new HashMap<>();
		int need;

		for(int i=0; i<a.length; i++) {
			need=k-a[i];
			if (store.containsKey(need)) {
				return new int[] { store.get(need),i};
			}
			else {
				store.put(a[i],i);
			}
		}
		return new int[] {-1,-1};
	}
	public static void main (String[] args) {
		int a[]= {2,3,4,5};
		int k=8;
		System.out.println(Arrays.toString(twoSum(a, k)));
	}
}