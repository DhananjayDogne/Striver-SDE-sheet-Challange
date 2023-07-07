import java.util.* ;
import java.io.*; 
public class Solution {
    
    public static long ayushGivesNinjatest(int n, int m, int[] time) {
        // Write your code here.
        long low=0,high=0;
        for(int i=0;i<m;i++){
            high+=time[i];
            // low=Math.max(low,time[i]);
        }
        long ans=0;
        while(low<=high){
            long mid=(low+high)/2;
            
            if(f(time,mid,n)){
                ans=mid;
               high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    static boolean f(int[] time,long maxtime,long n){
        
        long student=1;
        long sum=0;
        for(int i=0;i<time.length;i++){
            if(sum+time[i]<=maxtime){
               sum+=time[i];
            }else{
                student+=1;
                if(student>n || time[i]>maxtime){
                    return false;
                }
                sum=time[i];
            }
            
            
        }
        
        return true;
        
    }
}
