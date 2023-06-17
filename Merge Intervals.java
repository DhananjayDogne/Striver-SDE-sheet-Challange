import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        List<Interval> ans=new ArrayList<>();
       
        Arrays.sort(intervals, (a, b) -> a.start - b.start);
      
            int start=intervals[0].start;
            int end=intervals[0].finish;
           
            for(int j=1;j<intervals.length;j++){
                
                if((start<=intervals[j].start && intervals[j].start<=end)  ){
                    start=Math.min(start,intervals[j].start);
                    end=Math.max(end,intervals[j].finish);
                    
                }else{
                    ans.add(new Interval(start,end));
                    start=intervals[j].start;
                    end=intervals[j].finish;
                }
            }
            ans.add(new Interval(start,end));
          
          
            
        
        return ans;
    }
}
