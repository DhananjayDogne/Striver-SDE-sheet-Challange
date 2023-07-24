import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean areAnagram(String str1, String str2){
        // Write your code here.
        if(str1.length()!=str2.length())return false;
        int[] fre1=new int[26];
        
        for(char ch:str1.toCharArray()){
            fre1[ch-'a']++;
        }
        for(char ch:str2.toCharArray()){
            fre1[ch-'a']--;
        }
        for(int i=0;i<26;i++){
            if(fre1[i]!=0)return false;
        }
        return true;
    }
}
