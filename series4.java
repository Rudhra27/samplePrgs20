package Sample_Prgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class series4 {

	public static void main(String[] args)throws IOException {
		int num,x;
		 BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the number: ");
		 num=Integer.parseInt(n.readLine());
		
		 double sum=1;
		 double fact=1;
		 if (num>1)
		 {
		 	System.out.println("Enter the value of x");
		 	x=Integer.parseInt(n.readLine());
			
		 	for (int i=1; i<=num-1;i++)
		 	{
		 		for (int j=1; j<=i;j++)
		 			fact=fact*j;
		 		if ( i%2!=0)
		 			sum=sum+(Math.pow(-x,i))/fact;
		 		else 
		 			sum=sum+(Math.pow(x,i))/fact;
		 		fact=1;
		 	}
		 }
		 else if(num==1)
		 	sum=1;
		 else 
		 	 sum =0;
		 System.out.println("the sum of the series is : " + sum);
	}

}
