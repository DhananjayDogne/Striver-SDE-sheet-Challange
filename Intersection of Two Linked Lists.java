public class Solution {
    public static int findIntersection(Node firstHead, Node secondHead) {

        if(firstHead==null || secondHead==null) return 0;

        

        Node a = firstHead;

        Node b = secondHead;

 

        while(a!=b){

            a=a==null?secondHead:a.next;

            b=b==null?firstHead:b.next;

        }

 

        if(a==null) return 0;

        return a.data;

    }
}
