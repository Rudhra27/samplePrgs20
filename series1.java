package Sample_Prgs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class series1 {

	public static void main(String[] args)throws IOException  {
		int x;
		 BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the number: ");
		 x=Integer.parseInt(num.readLine());
		float n=0,n2=0;
		float sum=0;
		for (int i=1; i<=x;i++)
		{
			n=i;
			n2=i*i;
			sum=sum+(n2/n);
		}
		System.out.println("the sum of the series 1^2 / 1 + 2^2 / 2 + 3^2 / 3 + … + n^2 / n "
				+ "is : " + sum);
	}

}
