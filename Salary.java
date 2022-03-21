import java.util.Scanner;

public class Salary {
	int basicsalary,hra,sa,pf;
	float netpayablesalary;
	public void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the basic salary:");
		basicsalary=scan.nextInt();
		hra=(basicsalary/100)*50;
		System.out.println("HRA:"+hra);
		sa=(basicsalary/100)*75;
		System.out.println("special allowance:"+sa);
		pf=(basicsalary/100)*12;
		System.out.println("PF:"+pf);
		netpayablesalary=hra+sa+pf;
		System.out.println("Netpayablesalary:"+netpayablesalary);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Salary salary=new Salary();
     salary.getInput();
	}

}
