package com.abc.binarysearch;
import java.lang.*;
import java.util.*;
class methods
{
	Scanner sc= new Scanner(System.in);
	public void readelements(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println( "Enter "+(i+1)+"th element:");
			arr[i]=sc.nextInt();		
		}
	}
	public void printelements(int arr[])
	{
		System.out.print("elements in the arr: ");
		for(int i:arr)
		{
			System.out.print(i+"   ");
		}
		System.out.println("");
	}
	public void sort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
public class App 
{
    public static void main( String[] args )
    {
    	binarysearch bs = new binarysearch();
    	methods obj = new methods();
        Scanner sc= new Scanner(System.in);
        System.out.println( "ENTER THE SIZE OF ARRAY:" );
        int n=sc.nextInt();
        int[] arr=new int[n];
        obj.readelements(arr, n);
        obj.printelements(arr);
        obj.sort(arr);
        obj.printelements(arr);
        System.out.print("Enter serach element:");
        int key = sc.nextInt();
        int res=bs.binarySearch(arr, key, 0, arr.length-1);
        if(res!=-404)
        {
        	System.out.print("element found at "+(res)+"th position");
        }
        else
        {
        	System.out.print("element not found");
        }
    }
}
