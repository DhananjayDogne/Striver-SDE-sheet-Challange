import java.util.*;
public class Solution 
{
    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k) 
	{
        // Write your code here.
        // Collections.sort(arr);
         ArrayList<ArrayList<Integer>> set=new ArrayList<>();
        
        // ArrayList<ArrayList<Integer>> ans= new ArrayList<>(set);
        ArrayList<Integer> l=new ArrayList<>();
      
        f(0,arr,l,set,k);
        
        // Collections.sort(ans,(a,b)->a.size()-b.size());
        return set;
    }
    static void f(int i,ArrayList<Integer> arr,ArrayList<Integer> l,ArrayList<ArrayList<Integer>> set,int sum){
             
           if(i>=arr.size()){
              if( sum==0){
                 set.add(new ArrayList<>(l));
              }
              return ;
           }
           f(i+1,arr,l,set,sum);
           
           l.add(arr.get(i));
           sum-=arr.get(i);
           f(i+1,arr,l,set,sum);
           sum+=arr.get(i);
           l.remove(l.size()-1);
    
    
    }
}
