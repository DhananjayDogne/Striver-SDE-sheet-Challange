import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public static ArrayList<Integer> findSpans(ArrayList<Integer> price) {
        // Write your code here.
        ArrayList<Integer> ans=new ArrayList<>();
        int n=price.size();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            int start=0;
            ans.add(0);
            while(!st.isEmpty() && price.get(st.peek())<=price.get(i)){
                start+=ans.get(st.pop());
            }
            ans.set(i,start+1);
            st.push(i);
        }
        return ans;
    }
}
