import java.io.*;
import java.util.* ;

/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        LinkedListNode<Integer> head=new LinkedListNode(null);
        LinkedListNode<Integer> temp=head;
        while(first!=null && second!=null){
            if(first.data<second.data){
                temp.next=first;
                first=first.next;
            }else{
                temp.next=second;
                second=second.next;
            }
            temp=temp.next;
        }
        while(first!=null){
                temp.next=first;
                first=first.next;
                temp=temp.next;
        }
        while(second!=null){
                temp.next=second;
                second=second.next;
                temp=temp.next;
        }
        return head.next;
	}
}
