package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	void insertionSort(int array[])
	{
		int size=array.length;
		int j=0,key=0;
		for(int i=1;i<size;i++)
		{
			 key=array[i];
			 j=i-1;
		
		
		while(j>=0&&key<array[j])
		{
			array[j+1]=array[j];
			--j;
		}
		array[j+1]=key;
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {9,5,1,4,3};
		InsertionSort is=new InsertionSort();
		is.insertionSort(data);
		System.out.print("Sorted array in ascending order");
		System.out.println(Arrays.toString(data));
		   
}
}