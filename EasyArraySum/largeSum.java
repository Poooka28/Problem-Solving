package arRay;

import java.util.Scanner;

/*
Find the Largest element in an array
Problem Statement: Given an array, we have to find the largest element in the array.

Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 5
Explanation: 5 is the largest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 10
Explanation: 10 is the largest element in the array.

*/
public class largeSum 
{
	public static int largeNum(int[]array) 
	{
		int max=array[0];
		for(int i=1;i<array.length;i++)
		{
		  if(max<array[i])
		  {
			  max=array[i];
		  }
		}
		return max;
	}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n    =in.nextInt();
		int []arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		
		int maxNumber=largeNum(arr);
		
		System.out.println(maxNumber);
	}
}
