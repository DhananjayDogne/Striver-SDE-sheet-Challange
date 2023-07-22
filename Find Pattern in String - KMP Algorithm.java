import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean findPattern(String p, String s) {
        // Write your code here.
        int n=p.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==p.charAt(0)){
                if(i+n <=s.length() && s.substring(i,i+n).equals(p) )return true;
            }
        }
        return false;
    }
}
