import java.util.* ;
import java.io.*; 
public class Solution {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {

	    // Write your code here.
		
		Arrays.sort(arr);
		
		HashSet<ArrayList<Integer>> ans=new HashSet<>();
		for(int i=0;i<n-2;i++){
			        int j=i+1;
					int k=n-1;
					int target=K-arr[i];
					while(j<k){
						int sum=arr[j]+arr[k];
						if(sum==target){
                            ArrayList<Integer> list=new ArrayList<>();
							list.add(arr[i]);
							list.add(arr[j]);
							list.add(arr[k]);
							ans.add(list);
							j--;
						}else if(sum>target){
                               k--;
						} else{
							j++;
						}
					}
			}
        return new ArrayList<>(ans);
	}
}
