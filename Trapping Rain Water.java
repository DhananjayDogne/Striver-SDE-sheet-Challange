import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getTrappedWater(long[] arr, int n) {
        // Write your code here.
        
        long maxleft=0;
        long maxright=0;
        long ans=0;
        int i=0,j=n-1;
        while(i<=j){
            if(arr[i]<=arr[j]){
                if(arr[i]>maxleft){
                    maxleft=arr[i];
                }else{
                    ans+=maxleft-arr[i];
                }
                i++;
            }else{
                if(arr[j]>maxright){
                    maxright=arr[j];

                }else{
                    ans+=maxright-arr[j];
                }
                j--;
            }
        }
        return ans;
    }
}
