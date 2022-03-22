package twentytwo;

import java.util.Scanner;

public class TwodAddition {
	int i,j;
	static int[][] a=new int[3][3];
	static int[][] b=new int[3][3];
	static int[][] c=new int[3][3];
	
	Scanner sn=new Scanner(System.in);
	void getData1(int[][] a)
	{
		System.out.println("Enter the array1");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=sn.nextInt();
			}
		}
		
	}
	void getData2(int[][] b)
	{ 
		System.out.println("Enter the array2");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=sn.nextInt();
			}
		}
		
	}
	void display(int[][] c)
	{
		System.out.println("The sum of array1 and array2 is");
		for(i=0;i<3;i++) 
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwodAddition obj=new TwodAddition();
		obj.getData1(a);
		obj.getData2(b);
		obj.display(c);
	}
}
       
	/*void getData(int[][] a,int[][] b)
	{
		System.out.println("enter array1");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=sn.nextInt();
			}
		}
		System.out.println("enter array2");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=sn.nextInt();
			}
		}
		c[i][j]=a[i][j]+b[i][j];
		
    }
	void display(int[][] c)
	{
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++)
			{
				System.out.println(" "+c[i][j]);
			}
		}
	}
	

}*/
