package Sample_Prgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prg11 {
	
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

	public static void main(String[] args)throws IOException {
		int num;
		 BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the number: ");
		 num=Integer.parseInt(x.readLine());
		 if(check(num))
			 System.out.println(num+" is a Krishnamoorthy number");
		 else
			 System.out.println(num+" is not a Krishnamoorthy number");
		

	}

}
