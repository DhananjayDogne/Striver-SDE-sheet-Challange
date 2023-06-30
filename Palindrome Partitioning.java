import java.util.* ;
import java.io.*; 
public class Solution {
    public static List<List<String>> partition(String s) {
        // Write your code here.
        List<List<String>> arrl=new ArrayList<>();
        List<String> l=new ArrayList<>();
        solve(0,s,l,arrl);
        return arrl;

    }
    static void solve(int ind,String s,List<String> l,List<List<String>> arrl){
        if(ind>=s.length()){
            arrl.add(new ArrayList<String>(l));
            return ;
        }
        for(int i=ind;i<s.length();i++){
            if(ispal(s,ind,i)){
                l.add(s.substring(ind,i+1));
                solve(i+1, s, l, arrl);
                l.remove(l.size()-1);
            }
            
        }
        return ;

    }
    static boolean ispal(String s,int start,int end){
           int i=start,j=end;
           while(i<=j){
               if(s.charAt(i)!=s.charAt(j)){
                   return false;
               }
               i++;
               j--;
           }
           return true;
    }

}
