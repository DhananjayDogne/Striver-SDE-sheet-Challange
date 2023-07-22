import java.util.* ;
import java.io.*; 
public class Solution {
    public static int atoi(String str) {
        // Write your code here.
        int ans=0;
        int n = str.length();
        for(int i = 0 ; i<n ; i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                ans = ans * 10 + (str.charAt(i) - '0');
            }
        }
        if(str.charAt(0)=='-'){
            return -ans;
        }else{
            return ans;
        }
    }
}
