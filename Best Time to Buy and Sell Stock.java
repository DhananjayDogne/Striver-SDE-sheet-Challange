import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
     
        int min=prices.get(0);
        int ans=0;
        for(int i=1;i<prices.size();i++){
            if(prices.get(i)<min){
                min=prices.get(i);
            }else{
                ans=Math.max(ans,prices.get(i)-min);
            }
        }
        return ans;
    }


}
