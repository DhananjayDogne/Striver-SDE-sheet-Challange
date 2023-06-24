public class Solution
{
    public static Node removeKthNode(Node head, int k)
    {
        // Write your code here.
        if(head==null || head.next==null)return null;
        
        Node temp=head;
        Node temp2=head;
        
        while(temp!=null && k>0){
            k--;
            temp=temp.next;
        }
        if(temp==null)return head.next;
        while(temp.next!=null){
                
                temp2=temp2.next;
                temp=temp.next;
        }
    
        temp2.next=temp2.next.next;

        
       
        return head;
    }
}
