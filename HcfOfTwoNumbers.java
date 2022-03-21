package seventeenthmarchtwo;

import java.util.Scanner;

public class HcfOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int hcf=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number1");
		int number1=scan.nextInt();
		System.out.println("Enter the number2");
		int number2=scan.nextInt();
		
		for(int i=1;i<=number1&&i<=number2;++i)
		{
			if(number1%i==0&&number2%i==0)
			hcf=i;
		}
        System.out.println("The hcf of "+number1+"and "+number2+" is:"+hcf);

	}

}
