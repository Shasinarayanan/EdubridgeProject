package sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int size,i,j,temp;
    int arr[]=new int[50];
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter array size");
    size=scan.nextInt();
    System.out.print("Enter Array Elements:");
    for(i=0;i<size;i++)
    {
    arr[i]=scan.nextInt();
    }
    System.out.print("Sorting array using Selection sort technique:");
    for(i=0;i<size;i++)
    {
    	for(j=i+1;j<size;j++)
    	{
    		if(arr[i]>arr[j])
    		{
    			temp=arr[i];
    			arr[i]=arr[j];
    			arr[j]=temp;
    		}
    	}
    }
    System.out.print("Now the array after Sorting is:");
    for(i=0;i<size;i++) 
    {
    	System.out.println(arr[i]+" ");
    }
	}

}
