import java.util.* ;
import java.io.*; 
public class Solution {
    public static int distinctSubstring(String word) {
        // Write your code here.
        Set<String> set=new HashSet<>();
        int n=word.length();
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String s=word.substring(i,j);
                if(! set.contains(s)){
                    ans++;
                    set.add(s);
                }
            }
        }
        return ans;
    }
}
