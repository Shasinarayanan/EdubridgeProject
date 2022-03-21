package seventeenthmarchtwo;
import java.util.Scanner;

public class MultiplicationNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Positive Integer");
		int number=scan.nextInt();
		System.out.println("MULTIPLICATION TABLE FOR "+number+" is:");
		for(int i=1;i<=12;i++)
		{
		 int table=i*number;
		 
		 System.out.println(number+"*"+i+"="+table);	
		}

	}

}
