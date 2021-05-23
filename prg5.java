package Sample_Prgs;

public class prg5 {

	public static void main(String[] args) {
		System.out.println("the values of sin are from 0 to 360  in steps of 15 are : ");
		for (int i=0; i<=360;i=i+15)
		{
			double radian= i* (3.142/180.0);
			System.out.println("the value of sin"+i+" is " +Math.sin(radian));
		}
		System.out.println("\n the values of cos are from 0 to 360  in steps of 15 are : ");
		for (int i=0; i<=360;i=i+15)
		{
			double radian= i* (3.142/180.0);
			System.out.println("the value of cos"+i+" is " +Math.cos(radian));
		}
		System.out.println("\n the values of tan are from 0 to 360  in steps of 15 are : ");
		for (int i=0; i<=360;i=i+15)
		{
			double radian= i* (3.142/180.0);
			System.out.println("the value of tan"+i+" is " +Math.tan(radian));
		}


	}

}
