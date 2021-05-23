package Sample_Prgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prg16 {

	public static void main(String[] args)throws IOException {
		 BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		int m, n, c, d;
	    
		System.out.println("Enter the number of rows for matrix");
	    m=Integer.parseInt(x.readLine());
	    System.out.println("Enter the number of columns for matrix");
	    n=Integer.parseInt(x.readLine());

	    int M[][] = new int[m][n];
	    int Transpose[][] = new int[n][m];

	    System.out.println("Enter the elements the matrix");

	    for (c = 0; c < m; c++)
	    {
	      for (d = 0; d < n; d++)
	        M[c][d] = Integer.parseInt(x.readLine());
	    }
	    System.out.println(" The elements of matrix Before Transpose is");
	    for (c = 0; c < m; c++)
	    {
	      for (d = 0; d < n; d++)
	        System.out.print(M[c][d] + "\t");
	  
	      System.out.println();
	    }
	    for (c = 0; c < m; c++)
	    {
	      for (d = 0; d < n; d++)
	        Transpose[d][c] = M[c][d];  
	    }
	    System.out.println("The elements of matrix After Transpose is");

	    for (c = 0; c < n; c++)
	    {
	      for (d = 0; d < m; d++)
	        System.out.print(Transpose[c][d] + "\t");
	  
	      System.out.println();
	    }



	}

}
