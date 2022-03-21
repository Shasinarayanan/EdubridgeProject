package seventeenthmarchtwo;

import java.util.Scanner;

public class MaximumMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int smallest=100000;
		int largest=0,num;
		Scanner scan=new Scanner(System.in);
		char ch;
		
		do
		{
		System.out.println("how many numbers u want to enter:");
		int totalnumbers=scan.nextInt();
		System.out.println("Enter"+totalnumbers+"numbers");
		
		for(int a=0;a<totalnumbers;a++)
		{
			int number=scan.nextInt();
		if(number>largest)
			{
				largest=number;
			}
		if(number<smallest)
			{
				smallest=number;
			}
		}
        System.out.println("The largest number is:"+largest);
		
		System.out.println("The Smallest number is:"+smallest);
		System.out.println("Do u wish to continue if yes press'y' ");
		ch=scan.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		
}}

