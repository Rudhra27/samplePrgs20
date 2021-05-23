package Sample_Prgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class prg20_usingsort {

	public static void main(String[] args) throws IOException {
		int n;
		 BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the number of elements in an array: ");
		 n=Integer.parseInt(x.readLine());
		 
		String str[] = new String[n];
		String str2[] = new String[n];
		
		System.out.println("Enter " + n + " Strings");
		 for (int c = 0; c < n; c++)
			 str[c] = x.readLine();
		 str2=str;
	      System.out.println("Before sorting: ");
	      for(String string : str)
	      {
	         System.out.println(string);
	      }
	      // arrays.sort
	      Arrays.sort(str);
	      System.out.println("Sorting string array alphabetically: ");
	      for(String strAsc : str)
	      {
	         System.out.println(strAsc);
	      }
	      System.out.println("Sorting string array in descending order: ");
	      Arrays.sort(str2, Collections.reverseOrder()); 
	      for(String strDsc : str)
	      {
	         System.out.println(strDsc);
	      }
	}

}
