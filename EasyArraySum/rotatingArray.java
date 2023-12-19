/*Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: 2,3,4,5,1
Explanation: 
Since all the elements in array will be shifted 
toward left by one so ‘2’ will now become the 
first index and and ‘1’ which was present at 
first index will be shifted at last.


Example 2:
Input: N = 1, array[] = {3}
Output: 3
Explanation: Here only element is present and so 
the element at first index will be shifted to 
last index which is also by the way the first index.*/

public class rotatingArray {

	public static void main(String[] args) {
		
		
		int []a= {1};
		int n =a.length;
		int temp = a[0];
		
		for(int i=0;i<n-1;i++)
		{
			a[i]=a[i+1]; 
		}
		a[n-1]=temp;
		for(int b:a) {
			System.out.print(b+" ");
		}

	}

}
