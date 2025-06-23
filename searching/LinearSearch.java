package com.java.search;

public class LinearSearch 
{
	static int linear_search(int[] arr, int key)
	{
		for(int i=0;i<=arr.length;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int[] arr= {2,3,5,7,9};
		int key = 2;
		
		int result = linear_search(arr,key);
		
		if(result!=-1)
		{
			System.out.println("Key "+key+" found at index : "+result);
		}
		else {
			System.out.println("Not Found..!");
		}
	}
}