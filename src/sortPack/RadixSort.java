package sortPack;

public class RadixSort {
public int[] radix(int arr[])
{
	int divisor=10;
	for(int i=1;i<=3;i++)
	{
		divisor=(int)Math.pow(10, i);
		for(int j=0;j<arr.length-1;j++)
		{
			if((arr[j] % divisor) >(arr[j+1]%divisor))
			{
				int temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
			}
			else if((arr[j] % divisor) <= (arr[j+1]%divisor))
			{
				continue;
			}
		}
	}
	
	
	
	
	
	return arr;
}
private int findlargest(int arr[])
{
	int counter=0;
	for(int i=0;i<arr.length;i++)
	{ int temp=arr[i];
		while(temp!=0)
		{  
			temp=temp/10;
			++counter;
			
		}
	}
return 0;}
}
