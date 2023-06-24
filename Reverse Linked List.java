public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
		if(head==null || head.next==null)return head;
		
		LinkedListNode<Integer> pre=null;
		LinkedListNode<Integer> curr=head;
		while(curr!=null){
		     LinkedListNode<Integer> fut=curr.next;
			 curr.next=pre;
			 pre=curr;
			 curr=fut;
		}
		return pre;

    }
}
