import java.util.*;
class Main {
	public static List<List<Integer>> threeSum(int[] a) {
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(a);
		for(int i=0; i<a.length-2; i++) {
			if (i > 0 && a[i] == a[i - 1]) {
				continue;
			}
			int j=i+1;
			int k=a.length-1;
			while (j<k) {
				int sum=a[i]+a[j]+a[k];
				if (sum==0) {
					ans.add(Arrays.asList(a[i], a[j], a[k]));
					j++;
					k--;


					while (j < k && a[j] == a[j - 1]) {
						j++;
					}


					while (j < k && a[k] == a[k + 1]) {
						k--;
					}
				}
				else if(sum>0) {
					k--;
				} else {
					j++;
				}
			}

		}
		return ans;
	}

	public static void main(String[] args) {

		int[] a = {-1, 0, 1, 2, -1, -4};

		List<List<Integer>> ans = threeSum(a);

		System.out.println(ans);
	}
}