import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 ek baar pehle se exist karta hai
        map.put(0, 1);

        int currSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            // Current Prefix Sum
            currSum += nums[i];

            // Agar (currSum - k) pehle mila hai,
            // to utni subarrays mil gayi
            if (map.containsKey(currSum - k)) {
                count += map.get(currSum - k);
            }

            // Current Prefix Sum ki frequency update karo
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }
}