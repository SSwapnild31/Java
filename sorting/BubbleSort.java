package com.java.sorting;

public class BubbleSort 
{
	static void bubbleSort(int[] arr, int n)
	{
		int i,j,temp;
		boolean swapped;
		for(i=0;i<n-1;i++)
		{
			swapped=false;
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(swapped==false)
			{
				break;
			}
		}
	}
	
	static void printArray(int[] arr,int n)
	{
		int i;
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int[] arr = {54,31,78,89,11,8};
		int n = arr.length;
		
		bubbleSort(arr,n);
		
		System.out.println("Sorted array : ");
		printArray(arr,n);
	}
}