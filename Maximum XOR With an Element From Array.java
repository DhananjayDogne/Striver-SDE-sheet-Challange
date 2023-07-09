import java.util.*;

public class Solution {
    public static ArrayList<Integer> maxXorQueries(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> queries) {
        // Write your code here.
        Collections.sort(arr);
         ArrayList<Integer> ans=new  ArrayList<Integer>();
        for( ArrayList<Integer>  q :queries){
            int x=q.get(0);
            int a=q.get(1);
            if(a<arr.get(0)){
              ans.add(-1);
            }else{
                int localmax=0;
                for(int i:arr){
                    int temx=x;
                    if(i>a){
                        break;
                    }
                    temx ^=i;
                    localmax=Math.max(localmax,temx);
                }
                ans.add(localmax);
            }
        }
        return ans;
    }
}
