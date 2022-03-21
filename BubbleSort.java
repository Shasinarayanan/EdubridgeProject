package sorting;

public class BubbleSort {
	static void bubbleSort(int array[])
	{
		int size=array.length;
		
		
	
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
		static void printArray(int array[])
		{
			int n=array.length;
			System.out.print("After Sorting");
			for(int i=0;i<n;++i)
			{   
				
				System.out.print(array[i]+" ");
				System.out.println();
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {-2,4,5,6,11,-9};
		
		
		BubbleSort.bubbleSort(array);
		BubbleSort.printArray(array);
	}

	}


