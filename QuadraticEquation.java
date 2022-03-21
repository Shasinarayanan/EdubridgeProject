package sixteenthmarchtwo;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Input a:");
		double a=scan.nextDouble();
		System.out.println("Input b:");
		double b=scan.nextDouble();
		System.out.println("Input c:");
		double c=scan.nextDouble();
		double d=b*b-4.0*a*c;
		if(d>0)
		{
		   double r1 = (-b+Math.sqrt(d))/(2.0*a);
		   double r2 = (-b-Math.sqrt(d))/(2.0*a);
			System.out.println("The roots are" +r1+"and"+r2);
		}
		else if(d==0)
		{
			double r1=-b/(2.0*a);
			System.out.println("The root is" +r1);
		
		}
		else
		{
			System.out.println("The roots are not real,it is imaginary");
		}
		
			
		
		
		
		

	}

}
