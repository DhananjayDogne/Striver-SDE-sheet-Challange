import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long ans=0;
		int r=0;
		long sum=0;
		while(r<n){
             sum+=arr[r];
			 if(sum<=0){
				 sum=0;
			 }
			 ans=Math.max(ans,sum);
			 r++;
		}
		return ans;
	}

}
