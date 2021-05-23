package Sample_Prgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class series2 {

	public static void main(String[] args)throws IOException {
		 int x;
		 BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the number: ");
		 x=Integer.parseInt(num.readLine());
		 double sum=0;
		 for (int i=1; i<=x;i++)
		 {
		 	if ( i%2!=0)
		 		sum=sum+Math.pow(-x,i);
		 	else 
		 		sum=sum+Math.pow(x,i);
		 }
		 System.out.println("the sum of the series - X + X^2 – X^3 + X^4 +… "
		 		+ "is : " + sum);

	}

}
