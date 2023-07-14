import java.util.*;
import java.io.*;

public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        // Write your code here.
        ArrayList<Integer> ans=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
            ans.add(-1);
        }
		
		Stack<Integer> st=new Stack<>();
		for(int i=n-1;i>=0;i--){
			while(!st.isEmpty() && st.peek()>=arr.get(i)){
				st.pop();
			}
			if(!st.isEmpty()){
			
				ans.set(i,st.peek());
			}
			st.push(arr.get(i));
		}
		return ans;
    }
}
