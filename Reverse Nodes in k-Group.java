import java.io.*;
import java.util.* ;

/****************************************************************

    Following is the class structure of the Node class:

        class Node
        {
        public:
	        int data;
	        Node *next;
	        Node(int data)
	        {
		        this->data = data;
		        this->next = NULL;
	        }
        };

*****************************************************************/

public class Solution {
	private static int findLength(Node head){

int length=0;

while(head!=null){

length++;

head=head.next;

}

return length;

}
	public static Node getListAfterReverseOperation(Node head, int n, int b[]) {
		// Write your code here.
		if(head == null||head.next == null) return head;

int length = findLength(head);

Node dummyHead = new Node(0);

dummyHead.next = head;

Node pre = dummyHead;

Node cur;

Node nex;

for(int i=0;i<n;i++) {

if(length==0) break;

if(b[i]==0) continue;

cur = pre.next;

nex = cur.next;

for(int j=1;j<Math.min(b[i],length);j++) {

cur.next = nex.next;

nex.next = pre.next;

pre.next = nex;

nex = cur.next;

}

length = length-Math.min(b[i],length);

pre = cur;

}

return dummyHead.next;
	}
}
