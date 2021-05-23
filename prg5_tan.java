package Sample_Prgs;

public class prg5_tan {
	static int fac(int num) 
	{ 
		if (num == 0) 
			return 1; 
		int fact = 1; 
		for (int i = 1; i <= num; i++) 
			fact = fact * i; 

		// Return the factorial of a number 
		return fact; 
	} 
	public static void main(String[] args)
	{  
		double sum = 0; 
	System.out.println("the values of tan are from 0 to 360  in steps of 15 are : ");
	for (int j = 0; j <=360; j += 15) 
	{  
	   double radian=j*(3.12/180.0);
		for (int i = 1; i <= 5; i += 1) 
	    { 
			double B = 0; 
			int Bn = 2 * i; 
			for (int k = 0; k <= Bn; k++) 
			{ 
				double temp = 0; 
				for (int r = 0; r <= k; r++) 
					temp = temp + Math.pow(-1, r) * fac(k) * Math.pow(r, Bn) / (fac(r) * fac(k - r)); 
				B = B + temp / ((double)(k + 1)); 
			} 
			sum = sum + Math.pow(-4, i) * 
				(1 - Math.pow(4, i)) * B * Math.pow(radian, 2 * i - 1) / fac(2 * i); 
		} 
		System.out.println("the value of tan"+j+ " is " + sum); 
	} 
	}
	}
