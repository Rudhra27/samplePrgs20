package Sample_Prgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prg20 {

	public static void main(String[] args)throws IOException {
		int n;
		 BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the number of elements in an array: ");
		 n=Integer.parseInt(x.readLine());
		 
		String str[] = new String[n];
		String temp;
		
		System.out.println("Enter " + n + " Strings");
		 for (int c = 0; c < n; c++)
			 str[c] = x.readLine();
		 
		System.out.println("Strings in sorted order:");
		for (int j = 0; j < str.length; j++) {
	   	   for (int i = j + 1; i < str.length; i++) {
			if (str[i].compareTo(str[j]) < 0) {
				temp = str[j];
				str[j] = str[i];
				str[i] = temp;
			}
		   }
		   System.out.println(str[j]);
		}

	}

}
