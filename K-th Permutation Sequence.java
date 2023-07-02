import java.util.ArrayList;

public class Solution {
    public static String kthPermutation(int n, int k) {
        // Write your code here.
        ArrayList<String> l=new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        int fact=1;

        for(int i=1;i<n;i++){
            arr.add(i);
            fact*=i;
        }
        arr.add(n);
        k=k-1;
        String ans="";
        while(fact>0){
            ans+=Integer.toString(arr.get(k/fact));
            arr.remove(k/fact);
            if(arr.size()==0){
              break;
            }
            k=k%fact;
            fact=fact/arr.size();
            
        }
        
        return ans;

    }
    // static void f(int[] visit,ArrayList<String> l ,String s){
        
    //     if( s.length()==visit.length){
    //           l.add(s);
    //           return ;
    //     }
       
    //     for(int i=0;i<visit.length;i++){
    //         if(visit[i]==0){
    //             visit[i]=1;
    //             f(visit,l,s+Integer.toString(i+1));
    //             visit[i]=0;
    //         }
    //     }
        
        
    // }
}
