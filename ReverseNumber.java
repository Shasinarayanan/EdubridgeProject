package seventeenthmarchtwo;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value to Reverse:");
		int number=scan.nextInt();
		int reverse=0;
		while(number!=0)
		{
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
        System.out.println("The reverse Number is: "+reverse);
	}

}
