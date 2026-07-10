import java.util.*;

public class Main {

	public static void maxSubarraySum(int a[]) {

		int curSum = 0;
		int maxSum = Integer.MIN_VALUE;

		// Prefix Array
		int prefix[] = new int[a.length];

		prefix[0] = a[0];

		for (int i = 1; i < a.length; i++) {
			prefix[i] = prefix[i - 1] + a[i];
		}

		// Prefix Array Print
		System.out.println("Prefix Array: " + Arrays.toString(prefix));

		// Maximum Subarray Sum
		for (int i = 0; i < a.length; i++) {

			for (int j = i; j < a.length; j++) {

				curSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];

				if (curSum > maxSum) {
					maxSum = curSum;
				}
			}
		}

		System.out.println("Maximum Subarray Sum = " + maxSum);
	}

	public static void main(String[] args) {

		int a[] = {1, -2, 6, -1, 3};

		maxSubarraySum(a);
	}
}



