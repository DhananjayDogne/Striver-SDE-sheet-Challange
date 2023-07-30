import java.util.* ;
import java.io.*; 
/*

	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T val;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

*/

import java.util.ArrayList;

public class Solution {

  public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
    //Your code goes here
	if(root==null)return new ArrayList<>();
	Queue<BinaryTreeNode> q=new LinkedList<>();
	q.add(root);
	ArrayList<Integer> ans=new ArrayList<>();
	while(!q.isEmpty()){
          int n=q.size();
		  while(n-->0){
			  BinaryTreeNode node=q.poll();
			  if(node.left!=null){
				  q.add(node.left);
			  }
			  if(node.right!=null){
				  q.add(node.right);
			  }
			  ans.add(node.val);
		  }
	}
	return ans;
  }

}
