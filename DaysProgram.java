package sixteenthmarchtwo;

import java.util.Scanner;

public class DaysProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the day");
		System.out.println("1.Monday");
		System.out.println("2.Tuesday");
		System.out.println("3.Wednesday and Thursday");
		System.out.println("4.Friday");
		System.out.println("5.Saturday and Sunday");
		String option=scan.nextLine();
		switch(option)
		{
		case "monday":
			System.out.println("First day of the week");
			break;
		case "tuesday":
			System.out.println("second day of the week");
			break;
		case "wednesday and Thursday":
			System.out.println("mid day of the  week");
			break;
		case "Friday":
			System.out.println("Last Working day");
			break;
		case "Saturday and Sunday":
			System.out.println("Weekend");
			break;
		}

	}

}
