import java.util.*;


public class Main {
	public static void Union(int[]a, int[]b) {
		int n=a.length;
		int m=b.length;
		HashSet<Integer> union= new HashSet<>();
		for (int i=0; i<n ; i++ ) {
			union.add(a[i]);
		}
		for (int i=0; i<m ; i++ ) {
			union.add(b[i]);
		}

		for (int x : union) {
			System.out.print(x + " ");



		}
		System.out.println();
		System.out.println("Count = " + union.size());
	}


	public static void main (String[] args) {
		int a[]= {1,2,1,1,8,5,3,4};
		int b[]= {2,4,6,7,9};
		Union(a,b);
	}
}

