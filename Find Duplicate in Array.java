import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        int dp[]=new int[n];
        // int ans=0;
        for(int i=0;i<n;i++){
            if(dp[arr.get(i)]!=0)return arr.get(i);
            else{
                dp[arr.get(i)]=1;
            }
            }
        return 0;
    }
}
