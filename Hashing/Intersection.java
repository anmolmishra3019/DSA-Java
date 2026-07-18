import java.util.*;

public class Main {
	public static void Intersection(int[]a, int[]b) {
		int n=a.length;
		int m=b.length;
		HashSet<Integer> intersection= new HashSet<>();
		for (int i=0; i<n ; i++ ) {
			intersection.add(a[i]);
		}
		for (int i=0; i<m ; i++ ) {
			if (intersection.contains(b[i])) {
				System.out.print(b[i]+" ");
			}
		}


	
	}





	public static void main (String[] args) {
		int a[]= {1,2,1,1,8,5,3,4};
		int b[]= {2,4,6,7,9};
		Intersection(a,b);

	}
}
