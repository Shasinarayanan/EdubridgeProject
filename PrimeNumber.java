package seventeenthmarchtwo;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Positive integer");
		int number=scan.nextInt();
		int flag=0;
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println(number+"is not a prime number");
		else
			System.out.println(number+"is a prime number");
	}

}
