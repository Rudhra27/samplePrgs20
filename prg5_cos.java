package Sample_Prgs;

public class prg5_cos {

	public static void main(String[] args) {
		int t=1,fact=1;
		double sum=0;
	System.out.println("the values of cos are from 0 to 360  in steps of 15 are : ");
	for (int i=0; i<=360;i=i+15)
	{
		double radian= i* (3.142/180.0);
		for (int j=0; j<=30;j=j+2)
	  {  
	  for(int f=1;f<=j;f++)
	  {
		  fact=fact*f;
	  }
		if ( t%2!=0)
			sum=sum+(Math.pow(radian,j)/fact);
		else 
			sum=sum-(Math.pow(radian,j)/fact);
		t=t+1;
		fact=1;
	  }
		System.out.println("the value of cos"+i+" is " +sum);
		sum=0;
		t=1;
	}
	}

}
