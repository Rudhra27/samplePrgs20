package Sample_Prgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prg7 {

	public static void main(String[] args) throws IOException {
		int x,y,f=0;
		 BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the Starting number: ");
		 x=Integer.parseInt(num.readLine());
		 System.out.println("Enter the Ending number: ");
		 y=Integer.parseInt(num.readLine());
		 
		 System.out.println("The Prime Numbers between "+x+" and "+y+" are, ");
		 for(int j=1;j>=x && j<=y;j++ )
		 {
			 f=0;
		 for (int i=1; i<=j; i++)
		 {
		 	if (j%i == 0)
		 		f=f+1;	
		 }
		 if(f==2)
			 System.out.println(j);
	}
}
}
