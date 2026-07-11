import java.util.*;

public class Main {

    public static int maxSubArray(int[] a) {

        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {

            curSum += a[i];

            maxSum = Math.max(maxSum, curSum);

            if (curSum < 0) {
                curSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] a = {5, 4, -1, 7, 8};

        int ans = maxSubArray(a);

        System.out.println("Maximum Subarray Sum = " + ans);
    }
}