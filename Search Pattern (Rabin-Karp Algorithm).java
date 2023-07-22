import java.util.*;

public class Solution {
    public static List<Integer> stringMatch( String pattern ,String text){
        // Write your code here.
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<pattern.length();i++){
            if(pattern.charAt(i)==text.charAt(0)){
                if(check(i,text,pattern)){
                    ans.add(i+1);
                }
            }
        }
        return ans;
    }
    static boolean check(int start,String text, String pattern){
        int j=start;
        for(int i=0;i<text.length();i++){
            if(j==pattern.length())return false;
            if(text.charAt(i)!=pattern.charAt(j)){
                 return false;
            }
            j++;
        }
        return true;
    }
}
