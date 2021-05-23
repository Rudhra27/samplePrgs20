package Sample_Prgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prg15 {

	public static void main(String[] args) throws IOException {
		 BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		int m, n, r1,c1,r2,c2;
	    
		System.out.println("Enter the number of rows for first matrix");
	    r1=Integer.parseInt(x.readLine());
	    System.out.println("Enter the number of columns for first matrix");
	    c1=Integer.parseInt(x.readLine());
	    
	    
		System.out.println("Enter the number of rows for second matrix");
	    r2=Integer.parseInt(x.readLine());
	    System.out.println("Enter the number of columns for second matrix");
	    c2=Integer.parseInt(x.readLine());
	    

	    int m1[][] = new int[r1][c1];
	    int m2[][] = new int[r2][c2];
	    int c[][] = new int[r1][c2];

	    
	    
	    if(c1==r2)
	    {
	    	System.out.println("Enter the elements of first matrix");
	    for (m = 0; m< r1; m++)
	    {
	      for (n = 0; n < c1; n++)
	        m1[m][n] = Integer.parseInt(x.readLine());
	    }
	    
	    System.out.println("Enter the elements of second matrix");

	    for (m = 0; m< r2; m++)
	    {
	      for (n = 0; n < c2; n++)
	        m2[m][n] = Integer.parseInt(x.readLine());
	    }
	    System.out.println("the elements of first matrix");
	    for (m = 0; m< r1; m++)
	    {
	    	for (n = 0; n < c1; n++)
	        System.out.print(m1[m][n] + "\t");
	  
	      System.out.println();
	    }
	    System.out.println("the elements of Second matrix");
	    for (m = 0; m< r2; m++)
	    {
	    	for (n = 0; n < c2; n++)
	        System.out.print(m2[m][n] + "\t");
	  
	      System.out.println();
	    }

	    for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < r2; k++)
                    c[i][j] += m1[i][k] * m2[k][j];
            }
        }
	    System.out.println("Multiplication of the matrices:");

	    for (m = 0; m< r1; m++)
	    {
	    	for (n = 0; n < c2; n++)
	        System.out.print(c[m][n] + "\t");
	  
	      System.out.println();
	    }
	    }
	    else
	    	System.out.println("Column of First matrix and row of Second matrix must me same");

	}

}
