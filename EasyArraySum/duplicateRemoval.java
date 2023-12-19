package arRay;
/*Example 1:
  
Input: arr[1,1,2,2,2,3,3]
Output: arr[1,2,3,_,_,_,_]

Explanation: Total number of unique elements are 3, i.e[1,2,3] 
and Therefore return 3 after assigning [1,2,3] in the beginning of the array.

Example 2: 

Input: arr[1,1,1,2,2,3,3,3,3,4,4]
Output: arr[1,2,3,4,_,_,_,_,_,_,_]

Explanation: Total number of unique elements are 4, i.e[1,2,3,4] and 
Therefore return 4 after assigning [1,2,3,4] in the beginning of the array.*/

public class duplicateRemoval {
	
	static void duplicateRemoved(int[] arr){
		int temp = 0;
		for(int i=0;i<arr.length-1;i++) 
		{
			if(arr[i]!=arr[i+1]) {
			arr[i]=temp+arr[i];
			}
			
		}
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=5;
		int arr[] = {1,1,3,3,5};
		duplicateRemoved(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
