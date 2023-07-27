import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure:

    class BinaryTreeNode {
		int val;
		BinaryTreeNode left;
		BinaryTreeNode right;

		BinaryTreeNode(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

************************************************************/

public class Solution {
	 static class Pair{

        BinaryTreeNode node;

        int index;

        Pair(BinaryTreeNode node, int index){

            this.node = node;

            this.index = index;

        }

    }
	public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
		if(root==null){
			return new ArrayList<>();
		}
		// Write your code here.    
         Map<Integer,Integer> map = new TreeMap<>();

         Queue<Pair> q = new LinkedList<>();

         q.offer(new Pair(root, 0));

 

         while(!q.isEmpty()){
             int n=q.size();
			 while(n-->0){
                Pair curr = q.poll();

             BinaryTreeNode node = curr.node;

             int index = curr.index;

 
             if(!map.containsKey(index)){
                   map.put(index, node.val);
			 }
             

             if(node.left != null) q.offer(new Pair(node.left, index-1));

             if(node.right != null) q.offer(new Pair(node.right, index+1));
			 }
         }

 

         ArrayList<Integer> res = new ArrayList<>();

         for(int e: map.values()){

             res.add(e);

         }

 

         return res;
   } 
} 
