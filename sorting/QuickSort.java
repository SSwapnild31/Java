package com.java.sorting;


public class QuickSort 
{
	public static int quicksort(int[] arr, int low, int high)
	{
		if(low < high)
		{
			int pi = partition(arr, low, high);
			quicksort(arr, low, pi-1);
			quicksort(arr, pi+1, high);
		}
		return 0;
	}
	private static int partition(int[] arr, int low, int high) 
	{
		int pivot = arr[high];
		int i = low-1;
		
		for(int j=low;j<high;j++)
		{
			if(arr[j] < pivot)
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}
	
	public static void printArray(int[] arr)
	{
		for(int ar : arr)
		{
			System.out.print(ar+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {5,66,12,87,1,3,47}; 
		
		System.out.println("Before sorting :");
		printArray(arr);
		
		quicksort(arr, 0, arr.length-1);
		
		System.out.println("\n\nAfter sorting : ");
		printArray(arr);
	}
}