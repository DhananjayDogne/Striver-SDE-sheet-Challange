import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
         int dp[]=new int[n];
        // int ans=0;
        int r=0,m=0;
        for(int i=0;i<n;i++){
            if(dp[arr.get(i)-1]!=0)r= arr.get(i);
            else{
                dp[arr.get(i)-1]=1;
            }
            }
        for(int i=0;i<n;i++){
            if(dp[i]==0)m=i+1;
        }
        return new int[]{m,r};
    }
}
