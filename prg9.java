package Sample_Prgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prg9 {

	public static void main(String[] args)throws IOException {
		int num;
		 BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the number: ");
		 num=Integer.parseInt(x.readLine());
		 int r,n,i=0,cube;
		 n=num;
		 while (n!=0)
		  {
		 	r=n%10;
		 	cube=r*r*r;
		 	i+=cube;
		 	n=n/10;
		  }
		 if (num == i)
		 	System.out.println("It is a Amstrong number");
		 else
		 	System.out.println("It is not a Amstrong number");
		

	}

}
