package com.java.sorting;

public class SelectionSort
{
	static void selectionSort(int[] arr, int size)
	{
		System.out.println("Before Swapping ");
		for(int ar : arr)
		{
			System.out.print(ar+" ");
		}
		
		System.out.println("\n");
		
		int temp=0;
		int minIndex = -1;
		
		for(int i=0;i<size-1;i++)
		{
			minIndex = i;
			for(int j=i+1;j<size;j++)
			{
				if(arr[minIndex] > arr[j])
				{
					minIndex = j;
				}
			}
			
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
			for(int ar : arr)
			{
				System.out.print(ar+" ");
			}
			
			System.out.println();
		}
		
		
	}
	public static void main(String[] args) 
	{
		int[] arr = {9,7,3,1,5,6};
		int size = arr.length;
		
		selectionSort(arr,size);
	}
}