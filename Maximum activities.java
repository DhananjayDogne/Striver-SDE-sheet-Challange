import java.util.*;
public class Solution {
    public static int maximumActivities(List<Integer> start, List<Integer> end) {
        //Write your code here
        ArrayList<List<Integer>> list=new ArrayList<>();

        for(int i=0;i<start.size();i++){
              List<Integer> l=new ArrayList<>();
              l.add(start.get(i));
              l.add(end.get(i));
              list.add(l);
        }
        Collections.sort(list,(a,b)->a.get(1)-b.get(1));
      
        int e=list.get(0).get(1);
        
            
        int count=1;
        for(int j=1;j<list.size();j++){
                if(e<=list.get(j).get(0)){
                    e=list.get(j).get(1);
                    count++;
                }
        }
          
        return count;

    }
}
