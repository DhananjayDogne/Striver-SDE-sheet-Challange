import java.io.*;
import java.util.* ;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
		Map<Integer,Integer> map=new HashMap<>();
		int ans=0;
		int xorval=0;
		for(int i=0;i<arr.size();i++){
			int el=arr.get(i);
			xorval ^=el;
			
			if(xorval==x)ans++;
			
			int temp=xorval^x;
			if(map.containsKey(temp))ans+=map.get(temp);
				
			
			map.put(xorval,map.getOrDefault(xorval,0)+1);
			
		}
		return ans;

	}
}
