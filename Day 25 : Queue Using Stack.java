import java.util.*;
public class Queue {
    // Define the data members(if any) here.
    Stack<Integer> st;
    Queue() {
        // Initialize your data structure here.
        st=new Stack<>();
    }

    void enQueue(int val) {
        // Implement the enqueue() function.
        st.push(val);
    }

    int deQueue() {
        // Implement the dequeue() function.
        if(st.size()==0)return -1;
         Stack<Integer> temp=new Stack<>();
         for(int i=0;0<st.size();i++){
            temp.push(st.pop());
         }
         int ans=temp.pop();
         for(int i=0;0<temp.size();i++){
            st.push(temp.pop());
         }
         return ans;

    }

    int peek() {
        // Implement the peek() function here.
        if(st.isEmpty())return -1;
        return st.peek();
    }

    boolean isEmpty() {
        // Implement the isEmpty() function here.
        return st.isEmpty();
    }
}
