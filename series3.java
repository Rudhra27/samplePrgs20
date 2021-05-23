package Sample_Prgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class series3 {

	public static void main(String[] args)throws IOException {
		 int x;
		 BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the number: ");
		 x=Integer.parseInt(num.readLine());
		 int sum=0;
		 for (int i=1; i<=x; i++)
		 {
		 	for (int j=1; j<=i; j++)
		 		sum=sum+j;
		 }
		 System.out.println("to sum the series: 1 + (1 + 2) + (1+2+3) + … is: "+sum);
	}

}
