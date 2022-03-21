package sixteenthmarchtwo;

import java.util.Scanner;

public class MarksPerformance {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the marks");
		double marks=scan.nextDouble();
		if(marks>=90&&marks<=100)
			System.out.println("Excellent");
		else if(marks>=80&&marks<90)
			System.out.println("Good");
		else if(marks>=60&&marks<80)
			System.out.println("just Passed");
		else  
			System.out.println("Failed");

	}

}
