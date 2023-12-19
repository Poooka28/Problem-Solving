package arRay;
/*
Example 1:

Input: [1,2,4,7,7,5]
Output: Second Smallest : 2
	Second Largest : 5
Explanation: The elements are as follows 1,2,3,5,7,7 and hence second 
largest of these is 5 and second smallest is 2

Example 2:

Input: [1]
Output: Second Smallest : -1
	Second Largest : -1
Explanation: Since there is only one element in the array, it is the largest 
and smallest element present in the array. There is no second largest or second
 smallest element present.
 */
public class secondLargestNum {
	
	static private int secondlargest(int[] arr,int n)
	{
		if (n<2)
			return -1;
		
		int secondLarge= Integer.MIN_VALUE;
		int large= Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>large)
			{
				secondLarge= large;
				large= arr[i];
			}
			else if(arr[i]>secondLarge&&arr[i]!=large)
			{
				secondLarge= arr[i];
			}
		}
		return secondLarge;
	}
	static private int secondSmallest(int[] arr,int n)
	{
		if (n<2)
			return -1;
		
		int secondSmall= Integer.MAX_VALUE;
		int small= Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			if(arr[i]<small)
			{
				secondSmall= small;
				small= arr[i];
			}
			else if(arr[i]<secondSmall&&arr[i]!=small)
			{
				secondSmall= arr[i];
			}
		}
		return secondSmall;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1,2,4,7,7,5};
		int n = arr.length;
		
		int small=secondSmallest(arr,n);
		int large=secondlargest(arr,n);
		System.out.print(large +" ");
		System.out.print(small +" ");

	}

}
