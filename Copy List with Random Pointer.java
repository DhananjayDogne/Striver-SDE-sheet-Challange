public class Solution {
	public static LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head) {
		// Write your code here.
		if(head==null )return head;
		LinkedListNode<Integer> head2=new LinkedListNode<Integer>(0);
		LinkedListNode<Integer> temp=head2;
		while(head!=null){
              temp.data=head.data;
			  temp.next=head.next;
			  temp.random=head.random;
			  head=head.next;
			  temp=temp.next;
		}
		return head2;

	}
}
