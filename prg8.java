package Sample_Prgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prg8 {

	public static void main(String[] args)throws IOException {
		int num;
		 BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the number: ");
		 num=Integer.parseInt(x.readLine());
		 
		 int r,n,reverse=0;
		 n=num;
		 while (n!=0)
		  {
		 	r=n%10;
		 	reverse=reverse*10 + r;
		 	n=n/10;
		  }
		 if (num == reverse)
		 	System.out.println("It is a Palindrome number");
		 else
		 	System.out.println("It is not a Palindrome number");
	}

}
