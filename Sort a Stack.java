import java.util.* ;
import java.io.*; 
public class Solution {

	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
		f(stack);
		
	}
	static void f(Stack<Integer> st){
		if(st.size()==1){
			return ;
		}
		int top=st.pop();
		f(st);
		if(st.peek()<=top){
			st.push(top);
		}else{
			Stack<Integer> temp=new Stack<>();
			while(!st.isEmpty() && top<st.peek()){
                temp.push(st.pop());
			}
			st.push(top);
			while(!temp.isEmpty()){
				st.push(temp.pop());
			}
		}
	}

}
