package com.java.sorting;

public class InsertionSort 
{
	public static void main(String[] args) 
	{
		int[] arr = {8,7,1,4,9,5};
		int size = arr.length;
		
		System.out.println("Before swapping :");
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		
		for(int i=1;i<size;i++)
		{
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=key;
			
			System.out.println();
			for(int a : arr)
			{
				System.out.print(a+" ");
			}
		}
		
		System.out.println("\nAfter Swapping :");
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
	}
}