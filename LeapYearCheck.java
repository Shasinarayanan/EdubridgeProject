package sixteenthmarchtwo;

import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the year to check:");
		int year=scan.nextInt();
		if(year%4==0)
			if(year%100==0)
				if(year%400==0)
				{
					System.out.println(+year+"is a leap year");//it is a century year.eg:2000
				}
				else 
				{
				System.out.println(+year+"is not a leap year");//it is a century year,but not divided by 400.eg:1700,1800,1900
				}
			else
			{
				System.out.println(+year+"is a leap year");//its an ordinary year ratherthan century which is divisible by 4.like 2020,2024
			}
		else
		{
			System.out.println(+year+"is not a leap year");//it is not divisible by 4.eg:2021
		}
		  
		// TODO Auto-generated method stub

	}

}
