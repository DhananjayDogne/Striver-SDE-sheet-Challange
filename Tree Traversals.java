import java.util.* ;
import java.io.*; 
/************************************************************

	Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}

************************************************************/

public class Solution {
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        // Write your code here.
		List<List<Integer>> ans=new ArrayList<>();
		if(root==null )return ans;
		List<Integer> l=new ArrayList<>();
		inorder(root,l);
		ans.add(l);
		List<Integer> l2=new ArrayList<>();
		preorder(root,l2);
		ans.add(l2);
		List<Integer> l3=new ArrayList<>();
		postorder(root,l3);
		ans.add(l3);
		
		return ans;
    }
	static void inorder(BinaryTreeNode<Integer> root , List<Integer> l){
		if(root==null){
			return ;
		}
        if(root.left!=null){
			 inorder(root.left,l);
		}
		l.add(root.data);
		if(root.right!=null){
			 inorder(root.right,l);
		}
		return ;
	}
	static void preorder(BinaryTreeNode<Integer> root , List<Integer> l){
		
		l.add(root.data);
        if(root.left!=null){
			 preorder(root.left,l);
		}
		if(root.right!=null){
			 preorder(root.right,l);
		}
		return ;
	}
	static void postorder(BinaryTreeNode<Integer> root , List<Integer> l){
		
        if(root.left!=null){
			
			 postorder(root.left,l);
		}
		if(root.right!=null){
			
			 postorder(root.right,l);
		}
		l.add(root.data);
		return ;
	}
	
}
