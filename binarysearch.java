package com.abc.binarysearch;

public class binarysearch
{
	public int binarySearch(int arr[],int key,int left,int right)
	{
		if(left>right)
		{
			return -404;
		}
		int mid=(left+right)/2;
		if(arr[mid]==key)
		{
			return mid;
		}
		else if(arr[mid]<key)
		{
			return binarySearch(arr,key,mid+1,right);
		}
		else
		{
			return binarySearch(arr,key,left,mid-1);
		}
	}
}
