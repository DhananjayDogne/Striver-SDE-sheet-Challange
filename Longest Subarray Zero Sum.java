import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
       Map<Integer,Integer> map=new HashMap<>();
       int ans=0;
	   int sum=0;
	   for(int i=0;i<arr.size();i++){
		   sum+=arr.get(i);
		   if(sum==0){
				   ans=Math.max(ans,i+1);
			}else if(map.containsKey(sum)){
                   ans=Math.max(ans,i-map.get(sum));
			}else{
				map.put(sum,i);
			}
		   
	   }
	   return ans;


		// Write your code here.
		// return f(arr.size()-1,arr,0,-1);
	}
	// static int f(int ind,ArrayList<Integer> arr,int count,int sum){
	// 	if(sum==0){
	// 		if(ind<0)return count;
	// 		else{
	// 			return count+f(ind-1,arr,count+1,sum+arr.get(ind));
	// 		}
	// 	}
	// 	if(sum==-1)sum=0;
    //     if(ind<0)return 0;
	// 	int pick=f(ind-1,arr,count+1,sum+arr.get(ind));
	// 	int nopick=f(ind-1,arr,count,sum);
	// 	return Math.max(pick,nopick);
	// }
}
