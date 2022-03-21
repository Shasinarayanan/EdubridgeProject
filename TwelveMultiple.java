package sixteenthmarchtwo;

import java.util.Scanner;

public class TwelveMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scan.nextInt();
		if(number%12==0)
			System.out.println(+number+" is multiple of 12");
		else
			System.out.println(+number+" is not a multiple of 12");
		// TODO Auto-generated method stub

	}

}
