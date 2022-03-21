package seventeenthmarchtwo;

import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to find factorial");
		int number=scan.nextInt();
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
        System.out.println("Factorial of "+number+" is:"+fact);
	}

}
