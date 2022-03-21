package sixteenthmarchtwo;

import java.util.Scanner;

public class PositiveNegative {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Input number:");
		int number=scan.nextInt();
		if(number>0)
			System.out.println("Number is positive");
		else if(number<0)
			System.out.println("Number is Negative-");
		else
			System.out.println("Number is neither positive nor negative");

	}

}
