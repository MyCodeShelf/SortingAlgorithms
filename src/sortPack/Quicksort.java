package sortPack;

import java.util.Arrays;

public class Quicksort {
private int partition(int[] arr,int low ,int high)
{
	int pivot=arr[(low+high)/2];
	while(low<=high)
	{
		while(arr[low]<pivot)
		low++;
		
		while(arr[high]>pivot)
			high--;
		if(low<=high)
		{
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
	}
	return low;
}

private void quicksort(int[]arr ,int low ,int high)
{
	int pi=partition(arr,low,high);
	if(low<pi-1)
		quicksort(arr, low, pi-1);
	if(pi<high)
		quicksort(arr, pi, high);
	
	//return arr;
}
void display(int[] arr)
{ 
	quicksort(arr, 0, arr.length-1);
	System.out.println(Arrays.toString(arr));
}
}
