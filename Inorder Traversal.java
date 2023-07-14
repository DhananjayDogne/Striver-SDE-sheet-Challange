public class Solution {
    public static List<Integer> getInOrderTraversal(TreeNode root) {
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
        ans.add(root.data);
        if(root.right!=null){
            f(root.right,ans);
        }
    }
}
