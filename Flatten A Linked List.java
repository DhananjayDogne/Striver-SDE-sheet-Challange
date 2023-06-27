public class Solution {
    public static Node flattenLinkedList(Node head) {
        //Write your code here
        if(head==null || head.next==null)return head;
        
        
        Node L=flattenLinkedList(head.next);
        head.next=null;
        Node ans=merge(head,L);
        
        
        return ans;
    }
    static Node merge(Node h1,Node h2){
        Node ans=new Node(0);
        Node res=ans;
        while(h1!=null && h2!=null){
            if(h1.data>h2.data){
                ans.child=h2;
                h2=h2.child;
            }else{
                ans.child=h1;
                h1=h1.child;
            }
            ans=ans.child;
        }
        if(h1!=null){
            ans.child=h1;
        }else{
            ans.child=h2;
        }
        return res.child;
    }
}
