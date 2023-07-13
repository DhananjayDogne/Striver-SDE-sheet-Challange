import java.util.* ;
import java.io.*; 
public class Stack {

    // Define the data members.

    Queue<Integer> q;
    public Stack() {
        // Implement the Constructor.
        q=new LinkedList<>();
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        // Implement the getSize() function.
        return q.size();
    }

    public boolean isEmpty() {
        // Implement the isEmpty() function.
        return q.isEmpty();
    }

    public void push(int element) {
        // Implement the push(element) function.
        Queue<Integer> temp=new LinkedList<>();
        for(int i=0;0<q.size();i++){
            temp.add(q.remove());
        }
        q.add(element);
        for(int i=0;0<temp.size();i++){
            q.add(temp.remove());
        }

    }

    public int pop() {
        // Implement the pop() function.
        if(q.isEmpty()){
            return -1;
        }
        return q.remove();
    }

    public int top() {
        // Implement the top() function.
        if(q.isEmpty()){
            return -1;
        }
        return q.peek();
    }
}
