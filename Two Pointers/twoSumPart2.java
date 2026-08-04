import java.util.*;
class Main {
	public static int[] twoSumTwo(int[] a, int key) {

		int left = 0;
		int right = a.length - 1;

		while (left < right) {

			int sum = a[left] + a[right];

			if (sum == key) {
				return new int[] {left + 1, right + 1};
			} else if (sum > key) {
				right--;
			} else {
				left++;
			}
		}

		return new int[] {-1, -1};
	}

	public static void main (String[] args) {
		int a[]= {1,3,5,6,7};

		int ans[]=twoSumTwo(a, 10);
		System.out.print("{"+ans[0]+","+ans[1]+"}");
	}
}