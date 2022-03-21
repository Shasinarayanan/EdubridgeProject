package seventeenthmarchtwo;

import java.util.Scanner;

public class SumOfEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evensum=0;
		int oddsum=0;
		int sumofevenodd;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the starting number:");
	    int initial=scan.nextInt();
	    System.out.println("Enter the Ending number:");
	    int end=scan.nextInt();
	    for(int num=initial;num<=end;num++)
		{
			if(num%2==0)
			{
				
				evensum+=num;
			   
			}
			     
			else
			{ 
				
				oddsum+=num;
				
			}
            
	}
		System.out.println("sum of odd integer is:"+oddsum);
		System.out.println("sum of even Integer is:"+evensum);
		
		sumofevenodd=evensum+oddsum;
		System.out.println("sum of odd and even Integer is:"+sumofevenodd);

	}

}
