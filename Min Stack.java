

import java.util.Stack;

public class Solution {

    static class MinStack {

        Stack<Integer> stack, Min;

        // Constructor
        MinStack() {
            stack = new Stack<Integer>();
            Min = new Stack<Integer>();
        }

        void push(int num) {
            stack.push(num);
            if (Min.empty() || Min.peek() >= num) {
                Min.push(num);
            }
        }


        int pop() {
            if (!Min.empty() && Min.peek() == stack.peek()) {
                Min.pop();
            }

            int ret = -1;

            if (!stack.empty()) {
                ret = stack.peek();
                stack.pop();
            }

            return ret;
        }

        // return -1.
        int top() {
            int ret = -1;
            if (!stack.empty()) {
                ret = stack.peek();
            }
            return ret;
        }

    
        int getMin() {
            int ret = -1;
            if (!Min.empty()) {
                ret = Min.peek();
            }
            return ret;
        }
    }
}
