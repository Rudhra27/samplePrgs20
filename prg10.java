package Sample_Prgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prg10 {

	public static void main(String[] args)throws IOException {
		
		int x,y;
		 BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the Starting number: ");
		 x=Integer.parseInt(num.readLine());
		 System.out.println("Enter the Ending number: ");
		 y=Integer.parseInt(num.readLine());
		 
		 int r,n,i=0,cube;
		 System.out.println("The Amstrong Numbers between "+x+" and "+y+" are, ");
		 for(int j=1;j>=x && j<=y;j++ )
		 {
			 n=j;i=0;cube=0;r=0;
			 while (n!=0)
			  {
			 	r=n%10;
			 	cube=r*r*r;
			 	i+=cube;
			 	n=n/10;
			  }
			 if (j == i)
			 	System.out.println(j);
	   }
	}
}
