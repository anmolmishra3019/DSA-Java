import java.util.*;

class Main {

    public static int[] topKfreq(int a[], int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Frequency Count
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Bucket
        List<Integer>[] bucket = new ArrayList[a.length + 1];

        // Fill Bucket
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int num = entry.getKey();
            int freq = entry.getValue();

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(num);
        }

        // Print Bucket (Optional)
        for (int i = 0; i < bucket.length; i++) {
            System.out.println(i + " -> " + bucket[i]);
        }

        // Answer
        int[] ans = new int[k];
        int index = 0;

        // Traverse Bucket from End
        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {

            if (bucket[i] != null) {

                for (int num : bucket[i]) {

                    ans[index++] = num;

                    if (index == k) {
                        break;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int a[] = {1, 2, 1, 1, 2, 2, 3, 3, 4};
        int k = 2;

        int[] ans = topKfreq(a, k);

        System.out.println("Top " + k + " Frequent Elements:");
        System.out.println(Arrays.toString(ans));
    }
}