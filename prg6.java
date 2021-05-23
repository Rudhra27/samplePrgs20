package Sample_Prgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prg6 {

	public static void main(String[] args) throws IOException {
		int x,f=0;
		 BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the number: ");
		 x=Integer.parseInt(num.readLine());
		 
		 if(x==1)
			 System.out.println(x+" is neither prime nor composite");
		 else {
		 for (int i=2; i<=x/2; i++)
		 {
		 	if (x%i == 0)
		 		f=f+1;	
		 }
		 if(f!=0)
		 {
			 System.out.println(x+" is not a prime number");}
		 else
		 {
			 System.out.println(x+" is a Prime Number");
		 }
	}
	}
}
