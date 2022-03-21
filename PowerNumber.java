package seventeenthmarchtwo;

import java.util.Scanner;

public class PowerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the base value");
		int base=scan.nextInt();
		System.out.println("Enter the power value");
		int power=scan.nextInt();
		long result=1;
		for( ;power!=0;power--)//power=4 means ,it executes until it becomes zero 
		{
			result*=base;//if base=3 then 3*3*3*3
		}
        System.out.println("value is:"+result);

	}

}
