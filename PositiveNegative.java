package seventeenthmarchtwo;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int positive=0;
		int negative=0;
		int zeroes=0;
		Scanner scan=new Scanner(System.in);
		char ch;
		do
		{
		System.out.println("Enter the number:");
		int number=scan.nextInt();
		if(number>0)
			{
				positive++;
			}
		else if(number<0)
			{
				negative++;
			}
		else if(number==0)
		{
			zeroes++;
		}
		System.out.println("Do u wish to continue if yes press'y' ");
		ch=scan.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		System.out.println("no of Positive numbers:"+positive);
		System.out.println("No of Negative numbers:"+negative);
		System.out.println("no of zeroes:"+zeroes);
}
}


	


