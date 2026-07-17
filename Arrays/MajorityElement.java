import java.util.*;


public class Main {
	public static void MajorityElement(int[] a) {
		HashMap<Integer, Integer> map= new HashMap<>();
		for (int i=0; i<a.length ; i++ ) {
			if(map.containsKey(a[i])) {
				map.put(a[i],map.get(a[i])+1);
			}
			else {
				map.put(a[i],1);
			}

		}
		for(int key:map.keySet()) {
			if(map.get(key)>a.length/3) {
				System.out.print(key);
			}
		}
	}
	public static void main (String[] args) {
		int a[]= {1,2,1,1,3,4};
		MajorityElement(a);
	}
}