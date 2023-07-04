import java.util.* ;
import java.io.*; 
public class Solution {
    public static List<String> findPermutations(String s) {
        // Write your code here.
        int[] visit=new int[s.length()];
        List<String> ans=new ArrayList<>();
        f(visit,s,"",ans);
        return ans;
    }
    static void f(int[] visit,String s,String per, List<String> ans){
        if(per.length()>=s.length()){
            ans.add(per);
            return ;
        }
        for(int i=0;i<s.length();i++){
            if(visit[i]==0){
                visit[i]=1;
                per+=s.charAt(i);
                f(visit,s,per,ans);
                visit[i]=0;
                per=per.substring(0,per.length()-1);
            }
        }
    }
}
