
import java.util.*;

public class Main {

	public static int longestConsecutive(int[] nums) {

		if (nums.length == 0) {
			return 0;
		}

		HashSet<Integer> set = new HashSet<>();

		// Store all elements in HashSet
		for (int num : nums) {
			set.add(num);
		}

		int longest = 0;

		// Traverse every number
		for (int num : nums) {

			// Start only if it is the first element of a sequence
			if (!set.contains(num - 1)) {

				int current = num;
				int length = 1;

				// Count consecutive numbers
				while (set.contains(current + 1)) {
					current++;
					length++;
				}

				longest = Math.max(longest, length);
			}
		}

		return longest;
	}

	public static void main(String[] args) {

		int[] nums = {100,5,8,7,6, 4, 200, 1, 2};

		System.out.println(longestConsecutive(nums));
	}
}