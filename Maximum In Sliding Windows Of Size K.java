import java.util.* ;
import java.io.*;

public class Solution 
{

	public static ArrayList<Integer> getMaximumOfSubarrays(ArrayList<Integer> nums, int k) 
	{
		//	  Write your code here.
		int n=nums.size();
		
		Deque<Integer> dq=new ArrayDeque<>();
		ArrayList<Integer> ans=new ArrayList<>();
		for(int i=0;i<n;i++){
			if(!dq.isEmpty() && dq.peek() ==i-k )dq.poll();
             while(!dq.isEmpty() && nums.get(dq.peekLast())<nums.get(i)) dq.pollLast();          
			dq.offer(i);
            if(i>=k-1){
				ans.add(nums.get(dq.peek()));
			}
		    
		}
        return ans;
	}
}
