import java.util.ArrayList;

public class Solution {
	public static int longestSubSeg(ArrayList<Integer> arr , int n, int k) {
		// Write your code here.
		int ans=0;
		// for(int i=0;i<arr.size();i++){
		// 	int count=0;
		// 	int k2=k;
		// 	for(int j=i;j<arr.size();j++){
		// 		if(arr.get(j)==1){
		// 			count++;
		// 		}else{
		// 			if( k2>0){
		// 				count++;
		// 				k2--;
		// 			}else{
		// 				break;
		// 			}
		// 		}
		// 	}
		// 	ans=Math.max(ans,count);
		// }
		int i=0,j=0;
		int l=0;
		int k2=k;
		while(j<arr.size()){
			if(arr.get(j)==0){
			    
				if(k2>0){
					k2--;
					
				}else{

					while(i<arr.size() && arr.get(i)!=0)i++;
					
					i++;
				}
			}
		    ans=Math.max(j-i+1,ans);
			j++;
			
		}
		return ans;
	}
}
