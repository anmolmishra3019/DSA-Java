import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = scn.nextInt();
        }

        int[] diff = new int[n2];

        int i = n1 - 1;
        int j = n2 - 1;
        int k = n2 - 1;
        int c = 0;

        while (k >= 0) {
            int a1v = (i >= 0) ? a1[i] : 0;
            int d;

            if (a2[j] + c >= a1v) {
                d = a2[j] + c - a1v;
                c = 0;
            } else {
                d = a2[j] + c + 10 - a1v;
                c = -1;
            }

            diff[k] = d;

            i--;
            j--;
            k--;
        }

        // leading zeros skip
        int idx = 0;
        while (idx < diff.length && diff[idx] == 0) {
            idx++;
        }

        // print result
        while (idx < diff.length) {
            System.out.println(diff[idx]);
            idx++;
        }
    }
}
