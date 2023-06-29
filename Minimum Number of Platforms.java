import java.util.*;
public class Solution {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        // Write your code here.
        Arrays.sort(at);
        Arrays.sort(dt);
        int i=1,j=0;
        int ans=1;
        while(i<at.length && j<dt.length){
             if(dt[j]>=at[i]){
                 i++;
                 
                }
             else{
                 j++;
                
             }
             ans=Math.max(ans,i-j);
        }
        return ans;
    }
}
