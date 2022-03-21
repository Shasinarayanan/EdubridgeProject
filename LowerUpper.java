package sixteenthmarchtwo;

import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		char ch1;
		do
		{
		System.out.println("Enter the Alphabet to find whether uppercase or lowercase");
		char ch=scan.next().charAt(0);
		
		if(ch>='A'&&ch<='Z')
			System.out.println("it is an UPPERCASE");
		else if(ch>='a'&&ch<='z')
			System.out.println("it is an lowercase");
		else
			System.out.println("it is not an alphabet");
		
		System.out.println("Do u wish to continue if yes press'y' ");
		
		ch1=scan.next().charAt(0);
		}while(ch1=='y'||ch1=='Y');
		
		
		

	}

}
