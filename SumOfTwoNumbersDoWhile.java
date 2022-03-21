package seventeenthmarchtwo;

import java.util.Scanner;

public class SumOfTwoNumbersDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    long result;
    char ch;
	do
    {
    System.out.println("Enter the first number");
    int num1=scan.nextInt();
    System.out.println("Enter the Second number");
    int num2=scan.nextInt();
    result=num1+num2;
    System.out.println("The sum of two Numbers is "+result);
    System.out.println("Do u wish to continue if yes press'y' ");
	
	 ch=scan.next().charAt(0);
    
	}while(ch=='y'||ch=='Y');
	}

}
