public class Solution {

    public static Node findMiddle(Node head) 

    {

        // Write your code here

        Node sp = head; // declaration and assigning head to sp and fp

        Node fp = head;

        while(fp != null && fp.next != null){

            sp = sp.next; // sp moves one step at a time

            fp = fp.next.next; // fp moves two steps at a time

        }

 

        return sp; // at the end sp will be at middle of the list so return sp

    }

}
