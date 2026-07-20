import java.util.*;

class Main {
	public static boolean containsDuplicate(int[] a) {

		HashSet<Integer> count = new HashSet<>();

		for (int i=0; i<a.length ; i++ ) {
			if(count.contains(a[i])) {
				return true;
			}
			else {
				count.add(a[i]);
			}
		}
		return false;



	}
	
	 public static void main (String[] args) {
	    int a[]={1,2,3,4,5};
	    System.out.println("the array contains duplicate");
	    System.out.print(containsDuplicate(a));
	}
}