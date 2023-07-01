import java.util.* ;
import java.io.*; 
public class Solution
{
public static int findMinimumCoins(int amount)
    {
        // Write your code here.
        int[] coins={1,2,5,10,20,50,100,500,1000};
        return f(8,coins,amount);
    }
    static int f(int i,int[] coins,int amt){
        if(i==0)return amt;
        if(amt<=0)return 0;
        
        
        if(amt>=coins[i]){
            return 1+f(i,coins,amt-coins[i]);
        }else{
            return f(i-1,coins,amt);

        }
        

    }

}
