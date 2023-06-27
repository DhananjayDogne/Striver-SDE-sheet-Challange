public class Solution {
    public static Node rotate(Node head, int k) {
        // Write your code here.
        if(head==null || head.next==null || k==0)return head;
        int len=1;
        Node temp=head;
        while(temp.next!=null){
            len++;
            temp=temp.next;
        }
        k=k%len;
        if(k==0)return head;
        k=len-k;
        Node temp2=head;
        Node temp3=head;
        while(k>0){
              temp3=head; 
              head=head.next;
              k--;
        }
        temp3.next=null;
        temp.next=temp2;

        return head;
    }
}
