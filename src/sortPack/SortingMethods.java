package sortPack;

public class SortingMethods {
public static int[] bubbleSorted(int arr[])
{ int n=arr.length;
	for(int iteration=0;iteration<n-1;iteration++)
	{
		for(int compareIndex=0;compareIndex<n-1;compareIndex++)
		{
			if(arr[compareIndex]>arr[compareIndex+1])
			{
				int temp=arr[compareIndex];
				arr[compareIndex]=arr[compareIndex+1];
				arr[compareIndex+1]=temp;
			}
		}
	}
	return arr;
}
public static int[] bubbleSortedCompressed(int arr[])
{ int n=arr.length;
boolean noswap=true;
	for(int iteration=0;iteration<n-1;iteration++)
	{
		for(int compareIndex=0;compareIndex<n-iteration-1;compareIndex++)//with 1st iteration  last element will be largest and thus can be fixated at that index,thats why n-iteration-1 
		{
			if(arr[compareIndex]>arr[compareIndex+1])
			{
				int temp=arr[compareIndex];
				arr[compareIndex]=arr[compareIndex+1];
				arr[compareIndex+1]=temp;
				noswap=false;
			}
		}
		if(noswap==true)
			break;
	}
	return arr;
}
public static int[] SelectionSort(int arr[])
{ int n=arr.length;
	for(int iteration=0;iteration<n;iteration++)
	{
		int min=iteration;
		for(int compareIndex=iteration+1;compareIndex<n;compareIndex++)//with 1st iteration  last element will be largest and thus can be fixated at that index,thats why n-iteration-1 
		{
			if(arr[compareIndex]<arr[min])
			{
				min=compareIndex;
	}
		}
	int temp=arr[min];	
	arr[min]=arr[iteration];
			arr[iteration]=temp;  
	}
	return arr;
}
public static int[] InsertionSortSort(int arr[])
{ int n=arr.length;
	for(int marker=1;marker<n;marker++)
	{
		int keyData=arr[marker];
		int sortedArrayIndex=marker-1;
		while(sortedArrayIndex>=0 && arr[sortedArrayIndex]>keyData)//with 1st iteration  last element will be largest and thus can be fixated at that index,thats why n-iteration-1 
		{
			arr[sortedArrayIndex+1]=arr[sortedArrayIndex];
			sortedArrayIndex=sortedArrayIndex-1;
	}
		  arr[sortedArrayIndex+1]=keyData;
	}
	return arr;
}
}
