import java.util.*;
public class Main
{
    public static void inverse(int a[]){
        
        int[] inv= new int[a.length];
        for(int i=0; i<a.length; i++){
          int  v= a[i];
            inv [v]= i;}
         
            System.out.println("Given array:"+Arrays.toString(a));
            
            System.out.print("Inverse array:"+Arrays.toString(inv));
        }
        
        public static void main(String[] args){
            int a[]= { 3,1,2,4,0};
            inverse(a);
           
        }

}

