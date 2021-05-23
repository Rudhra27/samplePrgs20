package Sample_Prgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prg19 {

	public static void main(String[] args) throws IOException {
		int n;
		 BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the number of elements in an array: ");
		 n=Integer.parseInt(x.readLine());
		
		 int swap,c,d;
		 int array[] = new int[n];
		 
		    System.out.println("Enter " + n + " integers");
		 
		    for (c = 0; c < n; c++)
		      array[c] = Integer.parseInt(x.readLine());
		   
		    System.out.println("Choose Sorting Order:");
		    System.out.println("1 for Ascending \n2 for Descending");
		    int sortOrder = Integer.parseInt(x.readLine());
		    
		    for (c = 0; c < ( n - 1 ); c++) {
		      for (d = 0; d < n - c - 1; d++) {
		    	  if (sortOrder == 1) {
		        if (array[d] > array[d+1])
		        {
		          swap  = array[d];
		          array[d]= array[d+1];
		          array[d+1] = swap;
		        }
		    	  }
		    	  else {
		              
		              if (array[d] < array[d + 1]) {
		                int temp = array[d];
		                array[d] = array[d + 1];
		                array[d + 1] = temp;
		              }
		      }
		    }
		    }
		    System.out.println("Sorted list of numbers:");
		 
		    for (c = 0; c < n; c++)
		      System.out.println(array[c]);

	}

}
