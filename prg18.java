package Sample_Prgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prg18 {

	public static void main(String[] args) throws IOException {
		int n;
		 BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the number of elements in an array: ");
		 n=Integer.parseInt(x.readLine());
		
		 int temp;
       
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] =Integer.parseInt(x.readLine()); 
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < n-1 ; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
	}

}
