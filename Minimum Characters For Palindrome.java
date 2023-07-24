
public class Solution {

    public static int minCharsforPalindrome(String str) {
        //Write your code here
        int i=0,j=str.length()-1;
        int ans=0;
        while(i<j){
                if(str.charAt(i)==str.charAt(j)){
                    i++;
                    j--;
                }else{
                    ans=str.length()-j;
                    i=0;
                    while(str.charAt(i)==str.charAt(j)){
                        i++;
                        ans--;
                    }
                    j--;
                }
        }
        return ans;
    }

}
