import java.util.*;
public class Solution {
    public static boolean isValidParenthesis(String expression) {
        // Write your code here.
        Stack<Character> st = new Stack<>();
        for(char ch : expression.toCharArray()){
            if(st.isEmpty() || ch=='{' || ch=='(' || ch=='['){
                st.push(ch);
            }else{
                
                 if(ch=='}' && st.peek()=='{'){
                    st.pop();
                }else if(ch==')' && st.peek()=='('){
                   st.pop();
                }else if(ch==']' && st.peek()=='['){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
