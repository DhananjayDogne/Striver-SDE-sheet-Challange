import java.util.* ;
import java.io.*; 
/*
	This is signature of helper function 'knows'.
	You should not implement it, or speculate about its implementation.

	boolean knows(int A, int B); 
	Function 'knows(A, B)' will returns "true" if the person having
	id 'A' know the person having id 'B' in the party, "false" otherwise.
	Use it as Runner.knows(A, B);
*/
	
public class Solution {
	public static int findCelebrity(int n) {
        // Write your code here.
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<n;i++){
			st.push(i);
		}
		while(st.size()>1){
			int a=st.pop();
			int b=st.pop();
			if(Runner.knows(a,b)){
				st.push(b);
			}else{
				st.push(a);
			}
		}
		if(st.size()==0)return -1;
		int ans=st.pop();
		for(int i=0;i<n;i++){
			if(ans!=i && Runner.knows(ans,i))return -1;
		}
		for(int i=0;i<n;i++){
			if(i!=ans && !Runner.knows(i,ans))return -1;
		}
		return ans;
    }
}
