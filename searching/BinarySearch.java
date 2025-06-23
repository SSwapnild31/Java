package com.java.search;

import java.util.Arrays;

public class BinarySearch 
{
	static int binary_search(int[] arr, int key)
	{
			int left = 0;
			int right = arr.length-1;
			while(left<=right)
			{
				int mid = (left + right)/2;
				if(arr[mid]==key)
				{
					return mid;
				}
				else if(arr[mid]<key)
				{
					left = mid+1;
				}
				else 
				{
					right = mid-1;
				}
			}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		int[] arr= {27,35,11,41,89,63,77};
		Arrays.sort(arr);
		
		System.out.println("Sorted Array : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		int key=63;
		
		int result = binary_search(arr,key);
		
		if(result==-1)
		{
			System.out.println("Key not found..!");
		}
		else 
		{
			//System.out.println("Key not found..!");
			System.out.println("\nKey: "+arr[result]+"\nfound at index : "+result);
		}
	}
} 