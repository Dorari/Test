import java.util.Random;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.io.*;
public class Midterm_test {
        public static void main(String args[]) {      
                Random rd = new Random ( ) ;
                int [ ]  array = new int[10000000] ;
                for ( int i = 1 ; i <=  array.length ; i++ )
               {
                    array [i - 1] = rd.nextInt(10000000) ;
               }
               long start = System.currentTimeMillis( );
	int n = array.length;
	QuickSort qs = new QuickSort( ); 
	qs.sort(array , 0 , n - 1); 
                long end = System.currentTimeMillis( );
	for (int i = 0 ; i < n ; ++i) 
	System.out.println(( i + 1 ) + " : " + array [ i ] + "  " ) ; 
	System.out.println( ); 
               NumberFormat formatter = new DecimalFormat("#0.00000");
               System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
	} 
        int partition(int arr[] , int low, int high) 
	{ 
		int pivot = arr[high]; 
		int i = (low - 1);
		for (int j = low ; j < high ; j++ ) 
		{ 	
		if ( arr[ j ] < pivot) 
			{ 
			i++; 
			int temp = arr[i]; 
			arr[i] = arr[j]; 
			arr[j] = temp; 
			} 
		}  
		int temp = arr[i+1]; 
		arr[i+1] = arr[high]; 
		arr[high] = temp; 
		return i+1; 
	} 
        void sort(int arr[], int low, int high) 
	{ 
		if (low < high) 
		{ 
			int pi = partition(arr, low, high); 
			sort(arr, low, pi - 1); 
			sort(arr, pi + 1 , high); 
		} 
	}
}
