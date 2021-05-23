package Sample_Prgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prg13 {

	public static void main(String[] args) throws IOException {
		 BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		int m, n, c, d;
	    
		System.out.println("Enter the number of rows for matrix");
	    m=Integer.parseInt(x.readLine());
	    System.out.println("Enter the number of columns for matrix");
	    n=Integer.parseInt(x.readLine());

	    int m1[][] = new int[m][n];
	    int m2[][] = new int[m][n];
	    int sum[][] = new int[m][n];

	    System.out.println("Enter the elements of first matrix");

	    for (c = 0; c < m; c++)
	    {
	      for (d = 0; d < n; d++)
	        m1[c][d] = Integer.parseInt(x.readLine());
	    }
	    System.out.println("Enter the elements of second matrix");

	    for (c = 0; c < m; c++)
	    {
	      for (d = 0; d < n; d++)
	        m2[c][d] = Integer.parseInt(x.readLine());
	    }

	    for (c = 0; c < m; c++)
	    {
	      for (d = 0; d < n; d++)
	        sum[c][d] = m1[c][d] + m2[c][d];  
	    }
	    System.out.println(" the elements of First matrix");
	    for (c = 0; c < m; c++)
	    {
	      for (d = 0; d < n; d++)
	        System.out.print(m1[c][d] + "\t");
	  
	      System.out.println();
	    }
	    System.out.println(" the elements of Second matrix");
	    for (c = 0; c < m; c++)
	    {
	      for (d = 0; d < n; d++)
	        System.out.print(m2[c][d] + "\t");
	  
	      System.out.println();
	    }
	    System.out.println("Sum of the matrices:");

	    for (c = 0; c < m; c++)
	    {
	      for (d = 0; d < n; d++)
	        System.out.print(sum[c][d] + "\t");
	  
	      System.out.println();
	    }
	}

}
