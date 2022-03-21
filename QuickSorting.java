package sorting;

public class QuickSorting {
	static void QuickSorting(int arr[],int low,int high)
	{
		int mid=(low+high)/2;
		int i=low;
		int j=high;
		int pivot=arr[mid];
		while(i<=j)
		{
			while(arr[i]<pivot)
			{
				i++;
			}
		while(arr[j]>pivot)
		{
			j--;
		}
		if(i<=j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			}
	}
	if(low<j)
		QuickSorting(arr,low,j);
	if(high>i)
		QuickSorting(arr,i,high);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {15,4,5,89,25,45,84};
		System.out.println("Before Sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		QuickSorting(arr,0,arr.length-1);
		
		System.out.println("After Sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}  
	}
}


