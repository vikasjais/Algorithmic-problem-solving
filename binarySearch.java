/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class binarySearch
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int arr[]={1,2,3,4,4,4,4,4,8,11,16};
		int index=binarySearchIterative(arr,0,arr.length-1,11);
		if(index==-1) System.out.println("Element not found in array");
		else
		System.out.println(index);
	}
	
	/*Recursive Approach of binary search*/
	static int binarySearchRecursive(int arr[],int start,int end,int key){
		int mid;
		if(start<=end){
			mid=start+(end-start)/2;
			if(arr[mid]==key) return mid;// if key is found
			else if(arr[mid]>key) return binarySearchRecursive(arr,start,mid-1,key);
			else return binarySearchRecursive(arr,mid+1,end,key);
		}
		return -1;//If key is not found
	}
	
	/*Iterative approach of binary Search*/
	static int binarySearchIterative(int arr[],int start,int end,int key){
		int mid;
		do{
			mid=start+(end-start)/2;
			if(arr[mid]==key) return mid;
			else if(arr[mid]>key) end=mid-1;
			else start=mid+1;
		}while(start<=end);
		return -1;
	}
	
}