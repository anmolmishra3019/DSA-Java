import java.util.*;
public class Main
{
    public static void Reverse(int a[], int i, int j){
       while(i<j){
       int temp=  a[i];
        a[i]= a[j];
       a[j]= temp;
        
        i++;
        j--;
    }
    }
    
    
   public static void Rotate(int a[], int k){

    k = k % a.length;

    if(k < 0){
        k = k + a.length;
    }

    Reverse(a,0,a.length-k-1);
    System.out.println(Arrays.toString(a));

    Reverse(a,a.length-k,a.length-1);
    System.out.println(Arrays.toString(a));

    Reverse(a,0,a.length-1);
    System.out.println(Arrays.toString(a));
}

   public static void main(String[]args){
       int a[]= {1,2,3,4,5,6,7};
       int k=3;
       Rotate(a , k);
   }
        
    }