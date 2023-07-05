import java.util.*;

public class Solution
{
	public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
	{
		// Write your code here.
		int n=matrix.size();
		int m=matrix.get(0).size();
		int[] arr=new int[n*m];
		int k=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				arr[k]=matrix.get(i).get(j);
				k++;
			}
		}
		Arrays.sort(arr);
		int mid=arr.length/2;
		return arr[mid];

	}
}
