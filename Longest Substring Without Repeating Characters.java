import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		//write your code here
		Map<Character,Integer> map=new  HashMap<>();
		int ans=0,count=0;
		int l=0;
		for(int i=0;i<input.length();i++){
           char ch=input.charAt(i);
		   if(map.containsKey(ch) && map.get(ch)>=l){
			   l=map.get(ch)+1;
		   }
		   map.put(ch,i);
		   ans=Math.max(ans,i-l+1);
		}
		return ans;
	}
}
