import java.util.* ;
import java.io.*; 
public class Solution
{
    public static int jobScheduling(int[][] jobs)
    {
        // Write your code here
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int i=0;i<jobs.length;i++){
            int[] l={jobs[i][0],jobs[i][1]};
            pq.add(l);
        }
        int len=0;
        for(int i=0;i<jobs.length;i++)len=Math.max(jobs[i][0],len);
        int[] profit=new int[len+1];
        while(!pq.isEmpty()){
             int[] job=pq.poll();
             if(profit[job[0]]==0){
                 profit[job[0]]=job[1];
             }else{
                 int ind=job[0];
                 while(ind>0 &&profit[ind]!=0 ){
                     ind--;
                 }
                 if(profit[ind]==0)profit[ind]=job[1];
             }
        }
        int ans=0;
        for(int i=1;i<len+1;i++){
            ans+=profit[i];
        }
        return ans;
    }
}
