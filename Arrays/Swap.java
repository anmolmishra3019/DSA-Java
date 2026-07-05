import java.util.*;
public class ArraysCC {
    public static void swap(int arr[], int i, int j){
    int temp= arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
            }
                
    
        
    
	public static void main(String[]args) {
	    int numbers[]={2,4,6,8,10,12,14,16};
	   
	    
	   swap(numbers, 2,3);
	   
	   for (int i=0;i<numbers.length ;i++ ) 
	    System.out.println(numbers[i]);
	    
 
	}
}