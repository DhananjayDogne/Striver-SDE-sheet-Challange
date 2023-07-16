import java.util.ArrayList;
import java.util.Stack;

public class Solution {
  public static int largestRectangle(ArrayList<Integer> heights) {
    // Write your code here.
    int n=heights.size();
    Stack<Integer> st=new Stack<>();
    int[] right=new int[n];
    int[] left=new int[n];
    for(int i=0;i<n;i++){
      while(!st.isEmpty() && heights.get(st.peek())>=heights.get(i)){ 
        st.pop();
      }
      if(st.isEmpty()){
        left[i]=0;
      }else{
        left[i]=st.peek()+1;
      }
      st.push(i);
    }

    while(!st.isEmpty())st.pop();

    for(int i=n-1;i>=0;i--){
      while(!st.isEmpty() && heights.get(st.peek())>=heights.get(i)){ 
        st.pop();
      }
      if(st.isEmpty()){
        right[i]=n-1;
      }else{
        right[i]=st.peek()-1;
      }
      st.push(i);
    }
    int ans=0;
    for(int i=0;i<n;i++){
      ans=Math.max(ans,heights.get(i)*(right[i]-left[i]+1));
    }
    return ans;
  }
}
