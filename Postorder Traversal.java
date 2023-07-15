public class Solution {
    public static List <Integer> getPostOrderTraversal(TreeNode root) {
    	// Write your code here.

     List<Integer> ans= new ArrayList<>();
         f(root,ans);
          return ans;
    }
    static void f(TreeNode  root,List<Integer> ans){
        if(root==null)return ;
        if(root.left!=null){
            f(root.left,ans);
        }
        if(root.right!=null){
            f(root.right,ans);
        }
        ans.add(root.data);
    }
}
