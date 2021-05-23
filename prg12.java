package Sample_Prgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prg12 {

	static int fact(int x) 
	{ 
		if (x == 0) 
			return 1; 
		int fact = 1; 
		for (int i = 1; i <= x; i++) 
			fact = fact * i; 

		// Return the factorial of a number 
		return fact; 
	} 
	
	static boolean check(int num)
	{
		int sum=0,temp=num;
		while(temp!=0)
		{
			sum=sum+fact(temp%10);
			temp=temp/10;
		}
		if(sum==num)
			return true;
		else
			return false;
	}

	public static void main(String[] args) throws IOException {
		int x,y;
		 BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the Starting number: ");
		 x=Integer.parseInt(num.readLine());
		 System.out.println("Enter the Ending number: ");
		 y=Integer.parseInt(num.readLine());
		 
		 System.out.println("The Krishnamoorthy Numbers between "+x+" and "+y+" are, ");
		 for(int j=1;j>=x && j<=y;j++ )
		 {
			 if(check(j))
				 System.out.println(j);
		 }
		

	}

}
