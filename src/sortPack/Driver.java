package sortPack;
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		
		int[] inputArr = {45,23,11,11,77,98,0,28,0,434};
		RadixSort rd=new RadixSort();
		System.out.println(Arrays.toString(rd.radix(inputArr)));
	//	int leng=arr.length;
		Quicksort qck=new Quicksort();
		qck.display(inputArr);
	//	Arrays.toString(qck.quicksort(inputArr, 0 ,inputArr.length-1 ));
	//	qck.display(inputArr);
		//MergeClass.mergesort(inputArr);
		System.out.println(Arrays.toString(MergeClass.mergesort(inputArr, 0, inputArr.length-1)));
		// System.out.println(Arrays.toString(MergeClass.merge_sort(inputArr,0,inputArr.length-1)));
		// TODO Auto-generated method stub
int arr[]= {3,4,0,8,1};
//System.out.println(SortingMethods.bubbleSorted(arr));
///bubble sort driver
System.out.println(Arrays.toString(SortingMethods.bubbleSorted(arr)));
//compressed code  bubble sort call
System.out.println(Arrays.toString(SortingMethods.bubbleSortedCompressed(arr)));
System.out.println(Arrays.toString(SortingMethods.SelectionSort(arr)));
System.out.println(Arrays.toString(SortingMethods.InsertionSortSort(arr)));
	}

}
