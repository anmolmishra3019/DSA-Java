import java.util.*;
public class Main
{
	public static void subarray(int a[]) {

		for (int i=0; i<a.length ; i++ ) {
			for (int j=i; j<a.length; j++) {
				for (int k=i; k<=j; k++) {
					System.out.print(a[k]+" ");
				}
				System.out.println();
			}
		}


	}

	public static void main(String[] args) {
		int a[]= { 3,1,2,4,0};
		subarray(a);

	}

}